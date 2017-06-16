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
		// �Ʒ��� ���ڵ� Ÿ���� �ٲ� �� ���� �Ϸ��� �Ѵ�.
		//streamData.Decode(new String("EUC_KR"));
		//System.out.println(streamData.Encode());
		// �׷��� �ٽ� �����ϰ� �ʹ�. ��� �Ұ�?

		// �̷��Դ� �ȵȴ�.
		streamData = (BinaryDataPart)streamData ;  
//		streamData.Decode(new String("EUC_KR"));
//		System.out.println(streamData.Encode());
		// ��Ȯ�ϰ� �̷��� �ϴ°� �´�.
		((BinaryDataPart)streamData).Decode(new String("Divx.Mpeg4"));
		System.out.println(streamData.Encode());
	}
}
