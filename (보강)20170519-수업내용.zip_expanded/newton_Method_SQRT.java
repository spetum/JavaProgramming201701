public class newton_Method_SQRT {
	// 1. 첫번째 메소드로 구조화
	public static void qqq () {   
		double z = 1.0, x = 64.0;
		int i ;
		for (i=0; i < 8; i++) {
			z = z- (z*z-x)/(2*z) ;
		}
		System.out.println(z);
	}
	// 2. 매개변수로 제곱근을 구하려는 값(x)을 전달 받는 형태로 변화
	public static void qqq (double x) { 
		double z=1.0 ;
		int i;
		for (i=0; i < 12; i++)
			z = z - (z*z-x)/ (2*z);
		System.out.println(z);
	}
	// 3. 반복의 횟수(n)를 전달 받는 형태
	public static void qqq (double x, int n) { 
		double z=1.0 ;
		int i;
		for (i=0; i < n; i++)
			z = z - (z*z-x)/ (2*z);
		System.out.println(z);
	}
	// 4. 결과값을 반환하는 형태로 변형
	public static double Newton_Method_SQRT(double X, int n){ 
		double z=1.0 ;
		int i;
		for (i=0; i < n; i++)
			z = z - (z*z-X)/ (2*z);
		return z ;
	}
	
	public static void main(String[] args) {
		//qqq() ;
		//qqq(49.0);
		//qqq(2);
		//qqq(256);
		//qqq(1024) ;
		//qqq(4096) ;
		qqq(65536,16);
		qqq(32768.0*32768.0, 30);
		double e5 = Newton_Method_SQRT(4096*4096, 20) ;
		System.out.println(e5);
		e5 = Newton_Method_SQRT(65536*65536, 20) ; // 2^16*2^16 = 2^32 
		System.out.println(e5);
	}
}
