package rekursion;

public class FacultyBinominalCoefficient {

	public static int facultyBinominalCoefficient(int n, int k) {
		if(k == 0 || k == n) {
			return 1;
		} else {
			return facultyBinominalCoefficient(n-1,k-1) + facultyBinominalCoefficient(n-1,k);
		}

	}
	
	public static void main(String[] args) {
		
		System.out.println(facultyBinominalCoefficient(4,2));
		
	}

}
