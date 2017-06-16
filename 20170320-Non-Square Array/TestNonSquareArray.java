
public class TestNonSquareArray {

	public static void main(String[] args) {
		int [][] nonSquare =new int [4][];
		nonSquare[0] = new int[4];
		nonSquare[1] = new int[2];
		nonSquare[2] = new int[3];
		nonSquare[3] = new int[5];
		
		for (int i =0; i<nonSquare.length; i++) {
			if (i == 0) 
				for (int j=0; j < nonSquare[i].length; j++) {
					nonSquare[i][j] = 10 +j * 1; 
				}
			if (i == 1)
				for (int j=0; j < nonSquare[i].length; j++) {
					nonSquare[i][j] = 20 + j * 3;
				}
			if (i == 2)
				for (int j=0; j < nonSquare[i].length; j++) {
					nonSquare[i][j] = 30 + j * 1;
				}
			if (i == 3)
				for (int j=0; j < nonSquare[i].length; j++) {
					nonSquare[i][j] = 40 + j * 2;
				}
		} // end of i
		System.out.println("Array out: ");
		for (int i=0; i < nonSquare.length; i++) {
			System.out.print("{ ");
			for (int j=0; j < nonSquare[i].length; j++) {
				System.out.print(nonSquare[i][j] + ", ");
			} // end of j
			System.out.println(" }");
		} //end of i

		System.out.println("Array out:(Re-ordering) ");
		for (int i=0; i < nonSquare.length; i++) {
			System.out.print("{ ");
			for (int j=0; j < nonSquare[i].length-1; j++) {
				System.out.print(nonSquare[i][j] + ", ");
			} // end of j
			// System.out.print(nonSquare[i][j] + "} "); // j is not visible out of loop.
			System.out.println(nonSquare[i][nonSquare[i].length-1]+" }");
		} //end of i

	}

}
