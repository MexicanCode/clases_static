package principal;

public class Matematica {
	
	public static int factorial(int n) {
		if(n>0) {
			return n*(Matematica.factorial(n-1));
			
		}
		else if(n==0) {
			return 1;
			
		}
		else {
			return 1;
		}
	}
}
