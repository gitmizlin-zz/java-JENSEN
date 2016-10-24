package jdbc_slutprojekt.model;

// Övning 7
// Skriv en JavaBean-klass Character som ska motsvara en rad i characters-tabellen.

public class Employee {
	private int id;
	private String fname;
	private String lname;
	private int office;
	private int project;
	private String officeName;
	private String projectName;
	
	public Employee() {
		
	}

	Employee(String fname, String lname, int office, int project, String officeName, String projectName) {
		this.fname = fname;
		this.lname = lname;
		this.office = office;
		this.project = project;		
		this.officeName = officeName;
		this.projectName = projectName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}
	
	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", office=" + office + ", project="
				+ project + "]";
	}
}
