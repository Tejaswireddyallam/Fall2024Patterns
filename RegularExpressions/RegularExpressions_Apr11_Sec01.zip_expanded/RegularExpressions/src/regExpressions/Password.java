package regExpressions;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Password:
 * Must start with Capital Letters
 * Length must be atleast 8 characters
 * Contains letters and digits
 * Must end with a special character  $, @, *, #
 */
public class Password {
	public static void main(String[] args) {
		// Read input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		// Regular Expression
		String regex = "^[A-Z][a-zA-Z0-9]{6,}[$@*#]$";
		// ^[A-Z][a-zA-Z0-9]{7,}$|@|*|#$;
		
		Pattern object = Pattern.compile(regex);    
		Matcher m = object.matcher(password);
		
		if(m.matches()) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
		
	
	}
}
