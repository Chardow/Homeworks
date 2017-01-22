package softUni;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();
		int sum = 0;
		int number;
		for(int i = 1;i<=value;i++){
			number = i;
			while(number!=0){
				sum += number%10;
				number= number / 10;
			}
			
			if(sum == 5 || sum == 7 || sum ==11){
				System.out.println(i + "-> True");
			}else{
				System.out.println(i+" -> False");
			}
			sum=0;
		}
		
	}

}
