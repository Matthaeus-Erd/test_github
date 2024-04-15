package stack;

import java.util.Stack;

public class KorrekteKlammern {

	public static String korrekteKlammerung(String ausdruck) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < ausdruck.length(); i++) {
            char aktuellesZeichen = ausdruck.charAt(i);
            
            if (aktuellesZeichen == '(' || aktuellesZeichen == '{' || aktuellesZeichen == '[') {
                stack.push(aktuellesZeichen);
            }
            else if (aktuellesZeichen == ')' || aktuellesZeichen == '}' || aktuellesZeichen == ']') {
                if (stack.isEmpty() || !istPassendeKlammer(stack.pop(), aktuellesZeichen)) {
                    return "Fehlerhafte Klammerung";
                }
            }
        }
        
        if (stack.isEmpty()) {
            return "Korrekte Klammerung";
        } else {
            return "Fehlerhafte Klammerung";
        }
    }
    private static boolean istPassendeKlammer(char oeffnendeKlammer, char schliessendeKlammer) {
        return (oeffnendeKlammer == '(' && schliessendeKlammer == ')') ||
               (oeffnendeKlammer == '{' && schliessendeKlammer == '}') ||
               (oeffnendeKlammer == '[' && schliessendeKlammer == ']');
    }
    
    public static void main(String[] args) {
        String ausdruck = "(a + b) * (c - d)";
        System.out.println("Ausdruck: " + korrekteKlammerung(ausdruck));
    }
}


