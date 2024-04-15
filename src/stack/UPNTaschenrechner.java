package stack;

import java.util.Stack;

public class UPNTaschenrechner {
	 
	   public static double berechne(String ausdruck) {
	        Stack<Double> stack = new Stack<>();   
	        String[] tokens = ausdruck.split(" ");
	        for (String token : tokens) {
	            if (istZahl(token)) {
	                double zahl = Double.parseDouble(token);
	                stack.push(zahl);
	            } else {
	                double operand2 = stack.pop();
	                double operand1 = stack.pop();
	                double ergebnis = 0;
	                switch (token) {
	                    case "+":
	                        ergebnis = operand1 + operand2;
	                        break;
	                    case "-":
	                        ergebnis = operand1 - operand2;
	                        break;
	                    case "*":
	                        ergebnis = operand1 * operand2;
	                        break;
	                    case "/":
	                        ergebnis = operand1 / operand2;
	                        break;
	                    default:
	                        throw new IllegalArgumentException("Ungültiger Operator: " + token);
	                }
	                stack.push(ergebnis);
	            }
	        }
	        return stack.pop();
	    }
	    
	    private static boolean istZahl(String str) {
	        if (str.length() == 0 || (str.length() > 1 && str.charAt(0) == '-')) {
	            return false;
	        }
	        for (int i = (str.charAt(0) == '-') ? 1 : 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public static void main(String[] args) {
	        String ausdruck = "12 34 23 + *";
	        System.out.println("Ergebnis: " + berechne(ausdruck));
	    }
	}