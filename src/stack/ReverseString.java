package stack;

import java.util.Stack;

public class ReverseString {

	   public static String reverseString(String input) {
	        Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }
	        StringBuilder reversed = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversed.append(stack.pop());
	        }
	        return reversed.toString();
	    }
	    
	    public static void main(String[] args) {
	        String input = "Hallo Welt!";
	        String reversed = reverseString(input);
	        System.out.println("Ursprünglicher String: " + input);
	        System.out.println("Umgdrehter String: " + reversed);
	    }
}
