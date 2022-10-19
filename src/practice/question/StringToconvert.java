package practice.question;

import java.util.Scanner;

public class StringToconvert {

	public static String checkString(String str, int len) {
		int count = 1;
		char c = 0;
		String empstring = "";
		String final_str = "";
		for (int i = 0; i < len; i++) {
			while (i < (len - 1) && str.charAt(i) == str.charAt(i + 1)) {
				c = str.charAt(i);
				count++;
				i++;
				empstring = count + "" + c;
			}
			final_str = final_str + empstring;
			count = 1;
		}
		return final_str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Any String");
		String str = sc.next();
		int len = str.length();
		System.out.println(checkString(str, len));
	}
}