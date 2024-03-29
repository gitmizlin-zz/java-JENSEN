package jdbc_miniproject;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeFactory {
	
   private static SessionFactory factory;    
   
   
   EmployeeFactory () {
	   
      try {
         factory = new Configuration().configure().buildSessionFactory();
         
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         
         throw new ExceptionInInitializerError(ex); 
      }
      
      EmployeeFactory ef = new EmployeeFactory();

      /* Add few employee records in database */
      Integer empID1 = ef.addEmployee("Koko", "Alas", 3, 8);
      Integer empID2 = ef.addEmployee("Daisuke", "Daala", 5, 9);
      Integer empID3 = ef.addEmployee("Johnny", "Persson", 10, 10);

      /* List down all the employees */
      ef.listEmployees();

      /* Update employee's records */
      ef.updateEmployee(empID1, 4);

      /* Delete an employee from the database */
      ef.deleteEmployee(empID2);

      /* List down new list of the employees */
      ef.listEmployees();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, int office, int project){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = new Employee(fname, lname, office, project);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
         
      } catch (HibernateException e) {
    	  
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      
      return employeeID;
   }
   
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
        
         Query query = session.createQuery("FROM employees");
         
         @SuppressWarnings({ "rawtypes", "deprecation" })
		List list = query.list();
      
//         List list = session.createQuery("FROM Employee").list(); 

         
         for (Iterator iterator = 
                           list.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFname()); 
            System.out.print("  Last Name: " + employee.getLname()); 
            System.out.println("  Office: " + employee.getOffice()); 
            System.out.println("  Project: " + employee.getProject()); 
         }
         tx.commit();
         
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
         
      } finally {
         session.close(); 
      }
   }
   /* Method to UPDATE office for an employee */
   public void updateEmployee(Integer EmployeeID, int office){
	   
      Session session = factory.openSession();
      Transaction tx = null;
      
      try{
         tx = session.beginTransaction();
         Employee employee = 
                    (Employee)session.get(Employee.class, EmployeeID); 
         employee.setOffice(office);
		 session.update(employee); 
         tx.commit();
         
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
         
      } finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public void deleteEmployee(Integer EmployeeID){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         Employee employee = 
                   (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
         
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
         
      } finally {
         session.close(); 
      }
   }
   
   
}