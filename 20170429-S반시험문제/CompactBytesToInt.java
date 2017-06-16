public class CompactBytesToInt {
	public static int Compact_4Bytes_to_int ( byte[] byteArray) {
		int temp =0;
		temp |= byteArray[0] & ((1<<8)-1) ;
		temp <<=8 ;
		temp |= byteArray[1] & ((1<<8)-1) ;
		temp <<=8 ;
		temp |= byteArray[2] & ((1<<8)-1) ;
		temp <<=8 ;
		temp |= byteArray[3] & ((1<<8)-1) ;
		
		return temp ;
	}
	public static int Compact_4Bytes_To_int (byte[] byteArray) {
		return 
				((int) byteArray[0] <<24 ) | 
				((int) (byteArray[1] << 16) & ((1<<24)-1) )|
				((int) (byteArray[2] << 8 ) & ((1<<16)-1))|
				((int) (byteArray[3] &((1<<8)-1))) ;
	}
	public static void main(String[] args) {
		byte[] bArr = { (byte)192, (byte)168, (byte)64, (byte)125} ;
		int temp = Compact_4Bytes_to_int (bArr) ;
		System.out.println(temp);
		System.out.println(Integer.toBinaryString(temp));
//		for (int i=0; i< bArr.length; i++ ) {
//			int LTemp =0 ;
//			LTemp = bArr[i] & ((1<<8)-1);
//			System.out.print(Integer.toBinaryString(LTemp)+"/");
//		}
		temp = Compact_4Bytes_To_int (bArr) ;
		System.out.println(temp);
		System.out.println(Integer.toBinaryString(temp));		
	}
}
