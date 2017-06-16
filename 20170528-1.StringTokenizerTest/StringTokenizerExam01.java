import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer ;

public class StringTokenizerExam01 {
	public static void main(String[] args) {
		final String aStr = new String("2+3+5+66+88+323"); 
		//StringTokenizer token = new StringTokenizer(aStr);
		StringTokenizer token = new StringTokenizer(aStr, "+");
		ArrayList<String> v = new ArrayList<String>() ;
		int sum = 0;
		System.out.println("Current Token : " + token.countTokens());
		
		while (token.hasMoreTokens()) {
			String s = token.nextToken() ;
			System.out.println(s);
			sum += Integer.parseInt(s);
			v.add(s);
		}
		System.out.println(aStr+ " = " + sum);
		//Iterator<String> = v.iterator();
		int i=0;
		while (i++<v.size()-1-1) {
			System.out.print(v.get(i)+"+");
		}
		System.out.print(v.get(i)+"=");
	}

}
