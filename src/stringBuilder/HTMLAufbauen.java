package stringBuilder;

public class HTMLAufbauen {
	
	public static String htmlElement(String tag, String body) {
		if(tag == null || tag.isEmpty()) {
			return body;
		}else {
			String NewString = "<" + tag + ">" + body + "</" + tag + ">";
			System.out.println(NewString);
			return NewString;
			
		}
	}

	public static String strong(String body) {
		String tag = "strong";
		return htmlElement(tag, body);
				
	}
	
	public static String emphasized(String body) {
		String tag = "em";
		return htmlElement(tag, body);
	}
	
	public static void main(String[] args) {
		
		htmlElement("tag", "body");
		htmlElement(" ", "body");
		htmlElement("tag", " ");
		emphasized("body");
		strong("body");
		strong(emphasized("body"));

	}

}
