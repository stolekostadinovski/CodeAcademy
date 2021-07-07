package homeWorkRecursion;

public class FibonacciRecursion {

		
		   public static long fibonacci (long n) {
			      if ((n == 0) || (n == 1))
			         return n;
			      else
			         return fibonacci (n - 1) + fibonacci (n - 2);
			   }
			   public static void main(String[] args) {
			      System.out.println("The 0th fibonacci number is: " + fibonacci(0));
			      System.out.println("The 10th fibonacci number is: " + fibonacci(10));
			      System.out.println("The 15th fibonacci number is: " + fibonacci(15));
		
		
		
		
		
			   
	}

}
