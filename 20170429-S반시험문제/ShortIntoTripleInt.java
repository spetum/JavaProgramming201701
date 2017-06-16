public class ShortIntoTripleInt {
	public static void main(String[] args) {
		short S = (short) 0b1_11111_00001_01010 ;
		int T1, T2, T3 ;		
		T1  = (int) (S>>10) &((1<<5)-1) ;
		T2  = (int) (S>>5) &((1<<5)-1) ;
		T3 =  (int) S &((1<<5)-1) ;
		
		System.out.println(T1+","+T2+"," + T3);
	}

}
