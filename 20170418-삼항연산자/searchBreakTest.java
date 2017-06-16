public class searchBreakTest {
	public static void main(String[] args) {
		int i =0 , j=0 ;
	search: 
		for (i=2; i< 10; i++ ) {
			for (j=2; j < 50; j++ ) {
				if ((i*j % 64 )== 0) {
					//System.out.println(i + " * " + j); 
					break search;
					//continue search;
					//break ;
				} // end of if 
			} // end of for (j=1;
		} // end of for (i=1;
		
		System.out.println("end " + i + ", " + j);
	}

}

/*
break search ;
2 * 32
end 2, 32

continue search;
2 * 32
4 * 16
6 * 32
8 * 8
end 10, 50

break; 
2 * 32
4 * 16
6 * 32
8 * 8
end 10, 50

*/