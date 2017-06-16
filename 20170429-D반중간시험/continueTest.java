public class continueTest {
	public static void main(String[] args) {
		int value = 0;
		while (value < 7 ) {
			value ++ ;
			if ( value % 3 == 0 ) continue ;
			System.out.print("value : " + value + "\n");
		}			
	}
}