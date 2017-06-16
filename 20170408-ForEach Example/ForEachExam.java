enum Week { 월, 화, 수, 목, 금, 토, 일 }

public class ForEachExam {

	public static void main(String[] args) {
		int [][] TwoDim = {
				{ 11, 14, 16, 19, 25},
				{ 30, 17, 12, 13, 39},
				{ 10, 35, 21, 42, 47},
				{ 32, 45, 66, 52, 28}
				}; 
		int [][] NonSquareTwoDim = {
				{ 11, 14, 16, 19, 25, 30},
				{ 17, 12},
				{ 13, 39, 10, 35},
				{21, 42, 47},
				{ 32, 45, 66, 52, 28}
				};
		for ( Week wDay : Week.values() )
			System.out.print( wDay + "요일 ");
		System.out.println();
		
		// for (int element : TwoDim) // for-each로 2차원 배열을 바로 접근 못한다.
		for (int i=0; i < TwoDim.length; i++) {
			for (int element : TwoDim[i])
				System.out.print( element + "," );
			System.out.println();
		}
		System.out.println("NonSquareTwoDim: ");
		for (int i=0; i < NonSquareTwoDim.length; i++) {
			for (int element : NonSquareTwoDim[i])
				System.out.print( element + " " );
			System.out.println();
		}
		int matrixSize =0;
		for (int i=0; i < NonSquareTwoDim.length; i++) 
			matrixSize += NonSquareTwoDim[i].length ;
		System.out.println("Size of NonSquareTwoDim is " + matrixSize);
	} // end of main
} // end of class
