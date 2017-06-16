public class doubleModulo {
	public static double modulo (double c, double d) {
		return c - (int)(c/d)*d ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = 1.25, d = 0.5 ;
		double modulo ;
		
		// modulo = c - (int)(c/d)*d ;
		System.out.println(modulo(1.25, 0.5));
		System.out.println(modulo(1.24, 0.08));
		System.out.println(modulo(0.0, 0.0));
		
		
	}

}
