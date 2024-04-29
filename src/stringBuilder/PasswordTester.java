package stringBuilder;

public class PasswordTester {

	public static boolean istSonderzeichen(char zeichen) {
		return !Character.isLetterOrDigit(zeichen);
	}
	
	public static boolean isGoodPassword(String password) {
		if (password.length() < 8 ) {
			System.err.println("Passwort neu wählen(Mehr als 8 zeichen)");
			return false;
		}
		
		for(char zeichen : password.toCharArray()) {
			if(istSonderzeichen(zeichen)) {
				System.err.println("Passwort neu wählen(Braucht ein Sonderzeichen)");
				return false;
			}else {
				System.out.println("Passwort ist Gut");
				return true;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String password = "abcdabab";
		System.out.println(isGoodPassword(password));

	}

}
