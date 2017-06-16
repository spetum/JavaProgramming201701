import java.util.Scanner ;
public class instanceofTest {
	public static boolean isTypeOf(Integer k){
		return (k instanceof Integer);
	}
	public static boolean isTypeOf(Double k){
		return (k instanceof Double);
	}
	public static<T> String TypeName(T k){
		return k.getClass().getName() ;		
	}

	public static void main(String[] args) {

		System.out.println("3 is equal to 3.0 ? " + (3 == 3.0));
		Integer a3 = 3 ;
		Double d3 = 3.0 ;
		System.out.println("3 is equal to 3.0 ? " + a3.equals(d3));

		System.out.println("3 is Integer ?" + isTypeOf(3) );
		System.out.println("3.0 is double ?" + isTypeOf(3.0) );
		
		System.out.println("3.0f is " + TypeName(3.0f) );
		System.out.println("3.0f is " + TypeName(3.0) );		
		String TypeNameStr ;
		TypeNameStr = TypeName(3.0f) ; 
		
		Scanner rd = new Scanner(TypeNameStr) ;
		rd.useDelimiter("java.lang.");	
		System.out.println("" + rd.next() );
		rd.close();

		TypeNameStr = TypeName(3.0d) ;
		rd = new Scanner(TypeNameStr) ;
		rd.useDelimiter("java.lang.");	
		System.out.println("" + rd.next() );
		rd.close();

		TypeNameStr = TypeName((short)3) ;
		rd = new Scanner(TypeNameStr) ;
		rd.useDelimiter("java.lang.");	
		System.out.println("" + rd.next() );
		rd.close();
		
		TypeNameStr = TypeName((long)3) ;
//		rd = new Scanner(TypeNameStr);
//		rd.useDelimiter("java.lang.") ;		
//		switch (rd.next()) {
		switch( TypeName(3.0f)) {
		case "java.lang.Double" :
			System.out.println("double");
			break ;
		case "java.lang.Long" :
			System.out.println("long");
			break ;
		default:
			System.out.println("others");
		}
//		rd.close();
	}
}
