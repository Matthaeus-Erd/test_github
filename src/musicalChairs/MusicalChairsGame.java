package musicalChairs;

public class MusicalChairsGame {

	public static void main(String[] args) {
		
		MusicalChairs mc1 = new MusicalChairs("Lisa", "Susi", "Tom", "Lukas");
		System.out.println(mc1);

		MusicalChairs mc2 = new MusicalChairs("Madlene", "Benedikt");
		System.out.println(mc2);
		
		//MusicalChairs mc3 = new MusicalChairs();
		//System.out.println(mc3);
		
		mc1.rotate(2);
		System.out.println(mc1);
		
		mc1.rotateAndRemove(2);
		System.out.println(mc1);
	}

}
