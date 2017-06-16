
public class testFuncCall {
	public static int aa ;
	public static int func1() {
		return aa = aa * aa;
	}
	public static int func2() {
		return aa = aa * 4 ;
	}
	public static int func3() {
		return aa = aa / 3 ;
	}
	public static int func4() {
		return aa = -aa ;
	}
	public static void main(String[] args) {
		boolean res ;
		
		aa = 6 ;
		res = func1() > 5 && func2() > 10 || func3() < 24 && func4() > 0 ;
		System.out.println("Res = " + res ) ;
		System.out.println("aa = " + aa ) ;
		
		aa = 6 ;
		res = (( func1() > 5 && func2() > 10 ) || func3() < 24) && func4() > 0 ;
		System.out.println("Res = " + res ) ;
		System.out.println("aa = " + aa ) ;
		
		aa = 6 ;
		res = ( func1() > 5 && func2() > 10 ) || (func3() < 24 && func4() > 0 );
		System.out.println("Res = " + res ) ;
		System.out.println("aa = " + aa ) ;

/*		
		aa = 6 ;
		res = aa++ > 7 || ++aa < 7 && ++aa < 7 || aa++ > 7 ;  
		System.out.println("Res = " + res ) ;
		System.out.println("aa = " + aa ) ;

		aa = 6 ;
		res = ((aa++ > 7 || ++aa < 7 ) && ++aa < 7) || aa++ > 7 ;  
		System.out.println("Res = " + res ) ;
		System.out.println("aa = " + aa ) ;
		
		aa = 6 ;
		res = (aa++ > 7  || ++aa < 7 ) && (++aa < 7 || aa++ > 7) ;  
		System.out.println("Res = " + res ) ;
		System.out.println("aa = " + aa ) ;
*/
	}

}
