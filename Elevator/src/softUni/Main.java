package softUni;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p = input.nextInt();
		int answer = (int)Math.ceil((double)n/p);
		System.out.print(answer);
	}
}
