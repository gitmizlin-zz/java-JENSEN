import java.util.Scanner;

public class EvennessFunction {

	public static void main(String[] args) {
		System.out.println(isEven(444));
	}

	public static boolean isEven(int n) {
		boolean answer;
			if (n %2 == 0) {
				answer = true;
			} else {
				answer = false;
			}
		return answer;	
	}		
}