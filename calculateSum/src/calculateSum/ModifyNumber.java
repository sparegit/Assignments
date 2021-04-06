package calculateSum;

import java.util.Scanner;

public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = 0, diff;
		char c1;
		String str = String.valueOf(n);

		for (int i = 0; i < str.length()-1; i++) {
			char c = str.charAt(i);
			int a = c;
			//
			for (int j = i + 1; j < str.length(); j++) {
				c1 = str.charAt(i + 1);
				b = c1;
				if(j == str.length()) {
					b=0;
				}
			}
			diff = a - b;
			if (diff < 0) {
				System.out.print(diff * (-1));
			} else {
				System.out.print(diff);
			}
		}
		sc.close();
	}

}