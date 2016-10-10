

public class StackDemo  {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// Add element to Stack (the whole class is like a list)
		int i = 1;
		while (i <= 10) {
			stack.push(i);
			i++;			
		}	
		
		// Remove the last 5 elements
		i = 1;
		while (i <= 5) {
			int x=stack.pop();
			i++;		
			System.out.println(x);
		}	
	}
}	
