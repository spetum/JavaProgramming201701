// Uncompleted
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult; // for MatchResult

public class Scanner_File_Ex02 {
	public static void main(String[] args) throws FileNotFoundException {
		File aFile = new File("test.txt") ;
		// {3,5,6,7,9}
		Scanner aPro = new Scanner(aFile);
		while (aPro.hasNext() != false) {
			System.out.println(aPro.next());
		}
		System.out.println();
		aPro.close();
		//aPro = new Scanner(aFile).useDelimiter("(\\{)*(\\,)*(\\})*");
		//aPro = new Scanner(aFile).useDelimiter("\\{*");
		aPro = new Scanner(aFile);
		aPro.reset();
		aPro.useDelimiter(",");
		while (aPro.hasNext() != false) {
			System.out.print(" /"+aPro.next()+"/ ");
		}
		System.out.println();
		aPro.close();
		
		aPro = new Scanner(aFile) ;
		aPro.findInLine("[\\-](\\d+)");
		MatchResult result = aPro.match();
		for (int i=1; i<=result.groupCount(); i++) {
			System.out.println(i+": " + result.group(i));
		}
		aPro.close();
	}
}
