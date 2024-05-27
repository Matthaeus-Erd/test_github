package exceptions;
	 
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
	 
	public class MusikNotenLeser {
	 
		public static void main(String[] args) {
			Path filePath = Paths.get("Noten.txt");
	 
	        try (Scanner scanner = new Scanner(filePath)) {
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
		}
	 
	}
	
