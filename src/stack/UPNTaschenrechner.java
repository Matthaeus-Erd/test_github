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
	                double zahl2 = stack.pop();
	                double zahl1 = stack.pop();
	                double ergebnis = 0;
	                switch (token) {
	                	case "+":
	                    	ergebnis = zahl1 + zahl2;
	                    	break;
	                	case "-":
	                    	ergebnis = zahl1 - zahl2;
	                    	break;
	                    case "*":
	                        ergebnis = zahl1 * zahl2;
	                        break;
	                    case "/":
	                        ergebnis = zahl1 / zahl2;
	                        break;
	                    default:
	                        System.err.println("Ungültige Zahl: " + token);
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
	        String ausdruck = "5 3 +";
	        System.out.println("Ergebnis: " + berechne(ausdruck));
	    }
	}