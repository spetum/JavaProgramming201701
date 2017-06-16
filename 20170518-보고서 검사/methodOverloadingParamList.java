
public class methodOverloadingParamList {
	public float add ( int a, int b, float c) {
		return (float)(a+b)+c ;
	}
	public float add (int a, float b, int c) { 
		return (float)(a+c)+b ; 
	}
	public float add (float a, int b, int c) { 
		return (float)(b+c)+a ; 
	}
}
