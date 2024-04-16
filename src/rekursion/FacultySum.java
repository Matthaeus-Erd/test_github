package rekursion;

public class FacultySum {

	public static int facultySum(int n) {
		if(n == 0) {
			return 0;
		} else {
			return n + facultySum(n - 1);
		}

	}
	
	public static void main(String[] args) {
		
		System.out.println(facultySum(10));
		
	}

}
