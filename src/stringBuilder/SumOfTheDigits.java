package stringBuilder;

public class SumOfTheDigits {

	public static int digitSum(long value) {
		int quersumme = 0;
		while (value > 0) {
			quersumme += value % 10;
			value /= 10;
		}
		return quersumme;
	}
	
	public static void main(String[] args) {
		
		int value = 12345;
		int quersumme = digitSum(value);
		System.out.println(quersumme);
		
	}

}
