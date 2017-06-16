public class YearlyArray {
	public static int[ ] makeArray ( int n ) {
		int [ ] temp = new int[n];
		for (int i=0; i< temp.length; i++) 
			temp[i] = i ;
		return temp ;
	}	
	public static void main(String[ ] args) {				
		if (args.length != 1) 
			throw new  IllegalArgumentException(
					"\n�⵵�� �Է����ּ���.\n��) java YearlyArray 1995") ;
		
		int year ;
		
		try { // 199.2��� �Է��ϰų� �ٸ� ���ڰ� ���� ����ó���ϰ� ����
			year = Integer.parseInt(args[ 0]);
		} catch (NumberFormatException e) {
			System.err.println("���� ������ �⵵�� �Է����ּ���.");
			System.gc();
			return ;
		}
		
		int totalDays = 0 ;
		int [ ][ ] DaysInYear = new int[12][ ] ;		
			
		for (int i=0; i < DaysInYear.length; i++) {
			switch (i) {
			case 0: case 2: case 4: // 1, 3, 5 7��
			case 6: case 7: case 9: case 11: // 7, 8, 10, 12��
				DaysInYear [i] = makeArray(31) ;
				break ;
			case 1: // 2��
				if (year % 4 == 0 && year % 100 != 0 )
					DaysInYear [i] = makeArray(29) ;
				else DaysInYear [i] = makeArray(28) ;
				break ;
			default :
				DaysInYear [i] = makeArray(30) ;				
			} // end of switch 
		} // end of for (int i=0;
		for (int m=0; m < DaysInYear.length; m++) {
			System.out.println((m+1) + " �� :"+ DaysInYear[m].length + "��");
			totalDays += DaysInYear[m].length ;
		}
		System.out.println(args[0] + "�⵵�� " + totalDays + "���Դϴ�." ); 
	} // end of main
} // end of class
