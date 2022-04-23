// Program to find if a string is a substring of another String
package pullAndMergePractice;

import java.util.Scanner;

public class PriyaCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first String : 	");
		String firstString = scanner.next();

		System.out.print("Enter second String to check if substring : 	");
		String secString = scanner.next();

		// check if secString is substring of firstString
		System.out.println(firstString.toLowerCase().contains(secString.toLowerCase())
				? secString + " is a substring of " + firstString
				: "Not a substring");

		scanner.close();

	}

}
