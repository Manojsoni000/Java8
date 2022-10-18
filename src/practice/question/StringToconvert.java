package practice.question;

import java.util.Scanner;

public class StringToconvert {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any String");
		str = sc.next();

		int len = str.length();

		System.out.println(str);

		for (int i = 0; i < len; i++) {
			int count = 1;

			while (i < (len - 1) && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}

			System.out.print(count + "" + str.charAt(i));
		}
	}
}
