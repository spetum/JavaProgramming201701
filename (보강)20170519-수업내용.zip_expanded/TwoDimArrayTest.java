public class TwoDimArrayTest {
	public static void main(String[] args) {
		int [][] daysIn16Weeks = new int [16][7] ;
		
		for (int i=0; i < 16; i ++) {
			for (int j=0; j < 7; j ++ ) {
				daysIn16Weeks[i][j] = i*7 + j +1 ;
			} // end of for (j
		} // end of for (i
		for (int i=0; i < 16; i ++) {
			for (int j=0; j < 7; j ++ ) {
				System.out.print(daysIn16Weeks[i][j] + "\t") ; 
			} // end of for (j
			System.out.println();
		} // end of for (i
		
		int row, col ; 
		for (int k=0; k <112; k++ ) {
			// daysIn16Weeks[row][col] 
			row = k / 7 ;
			col = k % 7 ;
			System.out.print(daysIn16Weeks[row][col]);
			System.out.print(((k+1)%7)==0 ? "\n":"\t");
		}
	}
}













