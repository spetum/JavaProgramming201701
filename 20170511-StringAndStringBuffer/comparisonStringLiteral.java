
public class comparisonStringLiteral {

	public static void main(String[] args) {
		// aa�� bb��� ���ڿ� ���ͷ��� ���ͷ� ���̺� ����
		String aa = "Hello" ; 
		String bb = "Hello";
		
		if ( aa == bb ) // ���� ��ü�ΰ�?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		
		if (aa.equals(bb)) // ������ ������?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		// �Ѵ� ���� ����̴�. True
		
		// ee�� ff�� ���� �ð��� �����Ǵ� �� ����(Heap Area in run-time)�� ��ġ�Ѵ�.
		// ���� ���� �ٸ� ��ü�� �νĵȴ�.
		// javap -c comparisonStringLiteral.class
		// �� �ؼ� ���� 
		// //Method java/lang/String."<init>":(Ljava/lang/String;)V
		// �� �ι� ���� �Ѵ�. �� VM�� �̵��� ������ �� ������ ���� �����Ѵ�.
		String ee = new String("Hello"); 
		String ff = new String("Hello");
		
		String gg = ee ;
		
		if ( ee == ff ) // ���� ��ü�ΰ�?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		
		if (ee.equals(ff)) // ������ ������?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		// ee�� ff�� ���� ��ü�� �ƴ����� ���� ������ �� �� �ִ�.
		
		//�翬�� ������� ee�� gg ���� ��ü�� ����Ű�� ���۷����� ���̴�.
		if ( ee == gg ) // ���� ��ü�ΰ�?
			System.out.println("True");
		else 
			System.out.println("FALSE");
		
		if (ee.equals(gg)) // ������ ������?
			System.out.println("True");
		else 
			System.out.println("FALSE");
	}
}
