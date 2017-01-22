package softUni;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		BigDecimal number, number1;
		number = new BigDecimal(input.next());
		for(int i = 0; i<value-1;i++){
			number1 = new BigDecimal(input.next());
			number = number.add(number1);
			
		}
		
		System.out.print(number);
	}
}
