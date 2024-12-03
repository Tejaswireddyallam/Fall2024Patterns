package stack;

import java.util.*;

// @author Tejaswi Allam

public class ValidParenthesesClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("Enter any String");
        userInput = sc.next();
        
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>(); 
        Stack<String> braces = new Stack<>();
        
        
        
        Stack<String> allBraces = new Stack<>(); // Temporary Stack for all braces encountered
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            String chStr = Character.toString(ch);

            // Use regex to check if it's an operand (0-9, a-z, A-Z)
            if (chStr.matches("[0-9a-zA-Z]")) {
                operands.push(chStr);
            }
            // Use regex to check if it's an operator (+, -, *, /, %)
            else if (chStr.matches("[+\\-^*/%]")) {
                operators.push(chStr);
            }
            // Check opening braces
            else if (ch == '(' || ch == '[' || ch == '{') {
                braces.push(chStr); // Push opening braces
                allBraces.push(chStr); // Track all braces encountered in temporary stack
            }
            // Check closing braces
            else if (ch == ')' || ch == ']' || ch == '}') {
                braces.push(chStr); // Push closing braces

                // Check if the stack is empty for opening braces
                if (allBraces.isEmpty()) {
                    System.out.println("The braces are not closed correctly");
                    System.out.println("Operands stack: " + operands);
                    System.out.println("Operators stack: " + operators);
                    System.out.println("Braces stack: " + braces); 
                    sc.close();
                    return; 
                } else {
                    // Compare with the last opening brace in the stack
                    String lastOpeningBrace = allBraces.pop(); // Get and remove the last opening brace

                    // Check for valid pair
                    if (!(lastOpeningBrace.equals("(") && chStr.equals(")")) &&
                        !(lastOpeningBrace.equals("[") && chStr.equals("]")) &&
                        !(lastOpeningBrace.equals("{") && chStr.equals("}"))) {
                        System.out.println("The braces are not closed correctly");
                        System.out.println("Operands stack: " + operands);
                        System.out.println("Operators stack: " + operators);
                        System.out.println("Braces stack: " + braces); 
                        sc.close();
                        return;
                    }
                }
            }
            // Check for invalid characters
            else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '&') {
                System.out.println("Input String must contain numbers, alphabets and mathematical operators.");
                sc.close();
                return;
            }
        }

       
        System.out.println("Operands stack: " + operands);
        System.out.println("Operators stack: " + operators);
        System.out.println("Braces stack: " + braces);
        
     // Final validation
        if (allBraces.isEmpty()) {
            System.out.println("The braces are closed correctly");
        } else {
            System.out.println("The braces are not closed correctly");
        }
        sc.close(); 
    }
}
