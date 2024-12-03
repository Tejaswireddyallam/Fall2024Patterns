package regExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your mobile no: ");
			String mobileno = sc.nextLine();
			//String regex = "^[(]\\d{3}[)]\\d{7}$";
//			String regex = "^\\d{3}-\\d{3}$";
//			String regex = "^\\(\\d{3}\\)\\d{7}$";
			String regex = "^[0-9]{10}$";
			if(Pattern.matches(regex, mobileno) == true) {
				System.out.println("Correct ");
			} else {
				System.out.println("Incorrect ");
			}


	}

}
