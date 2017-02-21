package softUni;

import java.util.Iterator;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		String numbers = input.nextLine();
		char[] _numbers = numbers.toCharArray();
		String number = "";
		int indexOfWhiteSpace = numbers.lastIndexOf(' ');
		for (int i = 0; i < _numbers.length; i++) {
			if (i <= indexOfWhiteSpace) {

				if (_numbers[i] != ' ') {
					number += _numbers[i];
				} else {
					list.add(Integer.parseInt(number));
					number = "";
				}
			} else {
				list.add(Integer.parseInt(numbers.substring(indexOfWhiteSpace + 1)));
				break;
			}
		}
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer num = iterator.next();
			if (num < 0) {
				iterator.remove();
			}
		}
		Collections.reverse(list);
		if (list.size() == 0) {
			System.out.println("empty");

		} else {
			for (int i = 0; i < list.size(); i++) {

				System.out.println(list.get(i));
			}
		}
	}
}
