import java.util.Date;
import java.util.Scanner;
import java.util.Vector;


public class scannerDateVectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new Date().toString());
		Vector<String> dateVector = new Vector(6);

		while (sc.hasNext()) {
			dateVector.addElement(sc.next());					
		}
		System.out.println(dateVector.size());
		sc.close ();
		String[] scLists = new String[dateVector.size()];
		for (int i=0; i<dateVector.size(); i++){
			scLists[i] = dateVector.get(i) ;
			System.out.println(scLists[i]);
		}
		
	}
}
