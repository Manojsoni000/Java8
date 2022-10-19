package practice.question;

import java.util.Scanner;

public class ReverseString {

	public static String reverseWord(String str) {

		String words[] = str.split("\\s");
		int strlen = words.length;
		char character;
		String final_str = "";

		for (int i = 0; i < strlen; ++i) {
			character = words[i].charAt(0);
			// StringBuilder reverseString = new StringBuilder();

			final_str = ((character == 'w') || (character == 'W'))
					// ? (final_str + " " + reverseString.append(words[i]).reverse())
					
					? (final_str + " " + new StringBuilder(words[i]).reverse())
					: final_str + " " + words[i];

//			if ((character == 'w') || (character == 'W')) {
//				StringBuilder reverseString = new StringBuilder(reverseWord);
//				reverseString.append(words[i]);
//				reverseString.reverse();
//
//				// System.out.print(reverseString + " ");
//				final_str = final_str + " " + reverseString;
//			} 
//				// System.out.print(words[i] + " ");
//				final_str = final_str + " " + words[i];

			//
		}

		System.out.println("\n Total Number of words = " + words.length);
		return final_str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string");
		String str = sc.nextLine();

		System.out.println(reverseWord(str));
	}
}
