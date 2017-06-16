// Uncompleted
import java.util.Scanner;

public class Scanner_File_Ex01 {
	public static void main(String[] args) {
		String aStr = new String ("{3,5 ,6,7,9}");
		Scanner aPro = new Scanner(aStr);
		while (aPro.hasNext() != false) {
			System.out.println(aPro.next());
		}
		aPro.close();
		aPro = new Scanner(aStr);
		aPro.reset();
		aPro.useDelimiter(",\\{\\}");
		while (aPro.hasNext() != false) {
			System.out.println(aPro.next());
		}
		aPro.close();
	}
}
