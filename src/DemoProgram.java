import java.util.*;
import java.io.*;

public class DemoProgram {
	static File in = new File("words.in");
	static String words = "";
	static String wordOutput = "";

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(in))) {
			Scanner scan = new Scanner(System.in);
			while ((wordOutput = br.readLine()) != null) {
				System.out.println(wordOutput);
				words = scan.nextLine();
				if(!words.equals(wordOutput)) {
					System.out.println("go put on the dunce hat");
				}
			}
			br.close();
			scan.close();
		}

	}

}
