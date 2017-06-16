
public class comparisonStringLiteral {

	public static void main(String[] args) {
		// aa와 bb모두 문자열 리터럴로 리터럴 테이블에 존재
		String aa = "Hello" ; 
		String bb = "Hello";
		
		if ( aa == bb ) // 같은 객체인가?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		
		if (aa.equals(bb)) // 내용이 같은가?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		// 둘다 같은 결과이다. True
		
		// ee와 ff는 실행 시간에 생성되는 힙 영역(Heap Area in run-time)에 위치한다.
		// 따라서 서로 다른 객체로 인식된다.
		// javap -c comparisonStringLiteral.class
		// 를 해서 보면 
		// //Method java/lang/String."<init>":(Ljava/lang/String;)V
		// 가 두번 출현 한다. 즉 VM이 이들의 내용을 힙 공간에 새로 배정한다.
		String ee = new String("Hello"); 
		String ff = new String("Hello");
		
		String gg = ee ;
		
		if ( ee == ff ) // 같은 객체인가?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		
		if (ee.equals(ff)) // 내용이 같은가?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		// ee와 ff는 같은 객체는 아니지만 같은 값임을 알 수 있다.
		
		//당연한 얘기지만 ee와 gg 같은 객체를 가리키는 레퍼런스일 뿐이다.
		if ( ee == gg ) // 같은 객체인가?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		
		if (ee.equals(gg)) // 내용이 같은가?
			System.out.println("True");
		else 
			System.out.println("FALSE");
	}
}
