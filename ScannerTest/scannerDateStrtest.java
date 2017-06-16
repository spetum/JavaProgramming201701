import java.util.*;
//import java.util.regex.MatchResult;

public class scannerDateStrtest {

	public static void main(String[] args) throws IllegalStateException {
		Scanner sc = new Scanner (new Date().toString());
		String[] scLists = new String[6];
		String[] timeLists =new String[3] ;
		
		for (int i=0 ; i < scLists.length; i++) {
			//System.out.println(sc.next());
			scLists[i] = sc.next();
			System.out.println(scLists[i]);
		}
		String weekofday = new String(scLists[0]);
		String month = new String(scLists[1]);
		String day = new String(scLists[2]);
		String time = new String (scLists[3]);
		String timezone = new String(scLists[4]);
		String year = new String(scLists[5]);
		System.out.println(year + " " + month + " " + day + " " + weekofday + " " + time + " " + timezone );
		sc.close();
		sc = new Scanner(time);
		sc.useDelimiter(":") ;
		for (int i =0; i<timeLists.length; i++){
			timeLists[i] = sc.next();
		}
		System.out.println (timeLists[0] + " o\'clock " + timeLists[1] + " Minute " + timeLists[2] + " Second");
		sc.close();

	}

}
