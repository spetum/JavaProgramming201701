class AA { int aaa = 32 ; }
class BB extends AA { int bbb = 89 ; }
public class selfCasting {
	public static void main(String[] args) {
		AA ba1 = new BB() ;
		System.out.println(ba1.aaa);
		BB ba2 ;
		ba2 = (BB)ba1 ;
		System.out.println(ba2.bbb);
		
		// explicitly type casting is ok.
		System.out.println(((BB)ba1).bbb); 
		
		// self casting failed : type of ba1 is not changed
		ba1 = (BB)ba1 ;
		// System.out.println(ba1.bbb); // error : ba1.bbb is not accessible

	}
}
