package softUni;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(fibonacciLoop(number));
	}
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 2; i <= number; i++) {
			fibonacci = fibo1 + fibo2; 
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibonacci; 
	}
}
