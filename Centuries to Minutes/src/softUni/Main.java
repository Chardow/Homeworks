package softUni;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int centures  = input.nextInt();
		int years = centures * 100;
		long days = (long) (years * 365.2422);
		long hours = days * 24;
		long minutes = hours * 60;
		System.out.print(centures +" centures = "+years+" years = "+days+" days = "+hours+" hours = "+minutes +" minutes");
	}
}
