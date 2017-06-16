public class ternaryTest {
	public static void main(String[] args) {
		int a[] = { 0,1,1,0, 1,0,1,1, 1,1,0,1, 0,0,0,1 } ;
		int i;
		System.out.print( "{" ) ;
		for (i=0; i < a.length-1; i++ )
			System.out.print ( a[i] + ((( i+1) % 4 == 0) ?	 (( i+1) % 8 == 0) ? "\n" : " / "   : "," 	)) ;		
		System.out.print( a[i] + "}" ); 
		
		System.out.print( "\n{" ) ;
		for (i=0; i < a.length-1; i++ )
			System.out.print ( a[i] + ((( i+1) % 4 == 0) ?	 ",\n" :  "," 	)) ;		
		System.out.println( a[i] + "}" ); 
	}

}
