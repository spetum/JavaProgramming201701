
public class DoWhileContinue {

	public static void main(String[] args) {
		int a = 1 ;
		
		do {			
			if ( a % 2 == 0 )
				continue ;
			else 
				System.out.println("a = " + a);	
		} while ( a++ < 5) ;
		
		
		a = 1 ;
		while (a++ < 5 ) {
			if (a > 3 ) break ;
		}
		System.out.println("a = " + a);
	}
}
