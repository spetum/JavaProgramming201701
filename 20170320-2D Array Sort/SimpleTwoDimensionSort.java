// �ϼ���
public class SimpleTwoDimensionSort {
	public static void swapTwoDim(int[][] multiDimension, int i,int j, int m, int n) {
		int temp = multiDimension[i][j] ;
		multiDimension[i][j] = multiDimension[m][n];
		multiDimension[m][n] = temp ;
	}
	
	public static void PrintByRow( int [][] multiDimension) {
		int i,j ;
		for (i=0; i<multiDimension.length; i++) {
			System.out.print( "{" );
			for (j=0; j < multiDimension[i].length-1; j++) {
				System.out.print(multiDimension[i][j] + "," );
			} // end of j
			System.out.print(multiDimension[i][j] + "}\n" );
		} // end of i
	} // end of PrintByRow
	public static int orderNumber (int [][] multiDimension, int m, int n) {
		int kVal =0 ;
		if (m< 0 || m > multiDimension.length ) return -1;
		if (n < 0 || n > multiDimension[m].length) return -2;
		for (int i=0; i < m ; i++) {			
			kVal += multiDimension[i].length ;
		}
		return kVal+n;
	} // end of orderNumber
	
	public static void main(String[] args) {
		int [][] TwoDim = {
				{ 11, 14, 16, 19, 25},
				{ 30, 17, 12, 13, 39},
				{ 10, 35, 21, 42, 47},
				{ 32, 45, 66, 52, 28}
			}; 
		
		int k,m, p,s ;
		int comparee=0;
		int temp;
		for (k=0; k < TwoDim.length; k++) {
			for (m=0; m < TwoDim[k].length; m++) {
				// comparee = TwoDim[k][m] ;				
				for ( p=0; p < TwoDim.length; p++ ) {
					for (s=0; s < TwoDim[p].length; s++) {
//						if ( k==p && m==s) continue ;
//						if ( k > p ) break;
//						if ( m > s ) continue ;
						// �Ʒ��� ��������� ��쿡�� �������.
						// ������ ����� ��쿡�� �� ���� ������ ���� ���ؾ� �Ѵ�.						
//						if ( ((k-1)*TwoDim.length+m) < ((p-1)*TwoDim.length+s) )
//							continue;
						// �� ������� �̹� ���� ���ҵ��� �ٸ� ���ҵ�� �ѹ� �̻� ��Һ񱳸� �� ����̱� ������
						// ������ ���ҿ� ���� �ʿ䰡 ����. �׷��� �� �� �ֵ��� �ϱ� ���� �迭�� ���Ұ� ����Ǵ�
						// ���� ���� �̿��� ���Ϸ��� ������ ���ų� �ռ��� ��쿡�� �񱳸� �������� �ʰ� ����
						// ������ �����ϵ��� �Ѵ�.
						if ( orderNumber(TwoDim, k,m) >= orderNumber(TwoDim, p,s) )
							continue ;
						comparee ++ ;
						System.out.print("~Compares ("+k+", " + m + ") & " +"("+p+", " + s + ")\n");
						if (TwoDim[k][m] < TwoDim[p][s] ) {
							System.out.print("\tSwaps ("+k+", " + m + ") & " +"("+p+", " + s + ")\n");
							swapTwoDim(TwoDim, k,m,p,s) ;
						} // end of if 							
					} // end of S
					//PrintByRow(TwoDim);
				}// end of P
			} // end of M
		} // end of K
		PrintByRow(TwoDim);
		System.out.println(comparee);
	} // end of main()
} // end of class
