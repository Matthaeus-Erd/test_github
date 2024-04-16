package rekursion;

public class Faculty {

	public static int faculty(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n * faculty(n - 1);
		}

	}
	
	public static void main(String[] args) {

		System.out.println(faculty(5));
		
	}

}
