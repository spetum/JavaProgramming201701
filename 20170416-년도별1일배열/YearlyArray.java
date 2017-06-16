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
					"\n년도를 입력해주세요.\n예) java YearlyArray 1995") ;
		
		int year ;
		
		try { // 199.2라고 입력하거나 다른 문자가 들어가면 예외처리하고 종료
			year = Integer.parseInt(args[ 0]);
		} catch (NumberFormatException e) {
			System.err.println("십진 정수로 년도를 입력해주세요.");
			System.gc();
			return ;
		}
		
		int totalDays = 0 ;
		int [ ][ ] DaysInYear = new int[12][ ] ;		
			
		for (int i=0; i < DaysInYear.length; i++) {
			switch (i) {
			case 0: case 2: case 4: // 1, 3, 5 7월
			case 6: case 7: case 9: case 11: // 7, 8, 10, 12월
				DaysInYear [i] = makeArray(31) ;
				break ;
			case 1: // 2월
				if (year % 4 == 0 && year % 100 != 0 )
					DaysInYear [i] = makeArray(29) ;
				else DaysInYear [i] = makeArray(28) ;
				break ;
			default :
				DaysInYear [i] = makeArray(30) ;				
			} // end of switch 
		} // end of for (int i=0;
		for (int m=0; m < DaysInYear.length; m++) {
			System.out.println((m+1) + " 월 :"+ DaysInYear[m].length + "일");
			totalDays += DaysInYear[m].length ;
		}
		System.out.println(args[0] + "년도는 " + totalDays + "일입니다." ); 
	} // end of main
} // end of class
