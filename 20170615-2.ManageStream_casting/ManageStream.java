interface  handlePart  {
	void Decode ( ) ;
	String Encode ( ) ;
}

interface  handlePartConst  {
	String defaultEncodingType = "XVid.H264" ;
}

class  BinaryDataPart  implements  handlePart , handlePartConst  {
	private  String  encodingType ;
	public BinaryDataPart() {
		encodingType = defaultEncodingType ;
	}
	public  String  Encode( ) { return encodingType; }
	public  void  Decode( ) { encodingType = "AVC.MPEG4"; }
	public  void  Decode (String encodingName) {
		encodingType = encodingName;
	}
}

public  class  ManageStream {
	public static void main(String[] args) {
		handlePart streamData = new BinaryDataPart ( ) ;
		System.out.println(streamData.Encode());
		streamData.Decode();
		System.out.println(streamData.Encode());
		// 아래의 인코딩 타입을 바꿀 수 없게 하려고 한다.
		//streamData.Decode(new String("EUC_KR"));
		//System.out.println(streamData.Encode());
		// 그런데 다시 참조하고 싶다. 어떻게 할가?

		// 이렇게는 안된다.
		streamData = (BinaryDataPart)streamData ;  
//		streamData.Decode(new String("EUC_KR"));
//		System.out.println(streamData.Encode());
		// 명확하게 이렇게 하는게 맞다.
		((BinaryDataPart)streamData).Decode(new String("Divx.Mpeg4"));
		System.out.println(streamData.Encode());
	}
}
