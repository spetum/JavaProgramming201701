
public class stringAppend {
	// String은 레퍼런스 구조로 전달되지 않는다.
	public static void stringConcatenate (String a, String b) {
		a = a + b ;
	}
	public static String strAppend (String a, String b) {
		return a.concat(b) ;
	}
	public static void main(String[] args) {
		String hello = "Hello" ;
		String str = hello ;
		String str_1 = new String("") ;
		stringConcatenate(hello, "1");
		for (int i=0; i<4; i++) {
			str_1 = strAppend(str,str+Integer.toString(i));
			str = new String(str_1);
			System.out.println(str_1);
		}
	}
}
