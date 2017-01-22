package softUni;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double answer = (Math.pow(r, 2)*Math.PI);
		System.out.println(new DecimalFormat("##.############").format(answer));
	}
}
