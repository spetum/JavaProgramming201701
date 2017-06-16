public class newton_method_CubeRoot {
/*
	public static void main(String[] args) {
		double z = 1.0, x = -8.0 ;
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 1st.
		z = 1.0; x = 27.0 ;
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 1st.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 2nd.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 3rd.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 4th.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 5th.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 6th.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 7th.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 8th.
		z = z - ( z* z* z -x )/ (3*z*z) ;
		System.out.println(z); // 9th.
	}
*/
/*
	public static void main(String[] args) {
		double z = 1.0, x = -27.0 ;
		int i ; 
		for ( i=0; i < 9; i++ ) {
			z = z - ( z* z* z -x ) / (3*z*z) ;
			System.out.println(i+1+"th: "+z); 
		}
		z = 1.0; x = 27.0 ;
		for ( i=0; i < 9; i++ ) {
			z = z - ( z* z* z -x ) / (3*z*z) ;
			System.out.println(i+1+"th: "+z); 
		}
	}
*/	
	// 1. main 메소드를 ppp() 메소드로 구조화
	public static void ppp() {
		double z = 1.0, x = -27.0 ;
		int i ; 
		for ( i=0; i < 9; i++ ) {
			z = z - ( z* z* z -x ) / (3*z*z) ;
			System.out.println(i+1+"th: "+z); 
		}
		z = 1.0; x = 27.0 ;
		for ( i=0; i < 9; i++ ) {
			z = z - ( z* z* z -x ) / (3*z*z) ;
			System.out.println(i+1+"th: "+z); 
		}
	}
	// 2. 처음으로 매개변수를 받는 메소드의 형태 
	public static void ppp ( double x ) {
		double z = 1.0;
		int i ; 
		//for ( i=0; i < 9; i++ ) {
		//for ( i=0; i < 20; i++ ) {
		for ( i=0; i < 25; i++ ) {
			z = z - ( z* z* z -x ) / (3*z*z) ;
			System.out.println(i+1+"th: "+z); 
		}		
	}
	// 3. 값을 구하는 반복의 횟수(n)를 전달받도록 해보자.
	public static void ppp ( double x, int n) {
		double z = 1.0;
		int i ; 
		//for ( i=0; i < 9; i++ ) {
		//for ( i=0; i < 20; i++ ) {
		//for ( i=0; i < 25; i++ ) {
		for ( i=0; i < n; i++ ) {
			z = z - ( z* z* z -x ) / (3*z*z) ;
			System.out.println(i+1+"th: "+z); 
		}		
	}
	// 4. 화면 출력하는 부분을 빼고 순수하게 계산하는 기능만 갖게 하자.
	// 그런데 반환형이 있더라도 메소드의 매개변수 리스트가 동일하기 때문에
	// 부득이 이름을 변경해야 한다.
	public static double ppp_1 (double x,int n) {
		double z = 1.0;		
		for ( int i=0; i < n; i++ ) 
			z = z - ( z* z* z -x ) / (3*z*z) ;
		return z ;
	}
	public static double Newton_Method_CubeRoot (double x,int n) {
		double z = 1.0;		
		for ( int i=0; i < n; i++ ) 
			z = z - ( z* z* z -x ) / (3*z*z) ;
		return z ;
	}
	public static void main(String[] args) {
		//ppp() ;
		//ppp(729) ; // 14회 반복하면 근사값이 원하는 값이 된다.
		//ppp(27*27) ;
		//ppp (19*19*19); // 19*19*19 = 6859
		//ppp ( 81*81*81);
		//ppp ( 243*243* 243, 30) ;
		double e6 ;
		e6 = ppp_1 ( 243*243* 243, 30) ;
		System.out.println(e6);
	}
}






