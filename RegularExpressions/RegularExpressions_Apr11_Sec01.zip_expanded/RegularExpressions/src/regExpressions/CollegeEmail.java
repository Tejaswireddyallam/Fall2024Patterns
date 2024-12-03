package regExpressions;

import java.util.*;
import java.util.regex.*;

// Pattern
// 		- compile(String regex)
//		- matches(String regex, String text)
// Matches
// 		- find()
//		- matches()
public class CollegeEmail {
	public static void main(String args[]) {
		// Check our college email
		// Reading from user

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email: ");
		String email = sc.nextLine();
		// Regular expression
		// s123456@nwmissouri.edu (S or s) \d
		String regex = "^[s|S]\\d{6}(@nwmissouri.edu)$";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(email);
		if (m.matches() == true) {
			System.out.println("Correct email");
		} else {
			System.out.println("Incorrect email");
//				System.exit(0);
		}

	}
}
