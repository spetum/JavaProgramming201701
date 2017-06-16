public class Exam01_Euclidean_Algorithm {
	// 4. �޼ҵ�� ����� ��
	public static int EuclideanTest (int x, int y) {
		int r, s ;
		r = x%y;
		s = y;
		while (s != 0 && r%s!=0 ){
			r = r % s;
			s = s % r;
			//System.out.println("r := " + r + " , s := " + s);
		}
		// return s ;
		// 5. s�� 0�� �Ǹ� �ٷ� ������ �������� �� r��  �ִ� ������� �ȴ�.
		return (s ==0) ? r : s ;
	}
	public static void main(String[] args) {
		int x = 1071 ;
		int y = 1029 ;
		// 1. ó������ �̷��� �غ�.
//		System.out.println(x%y);
//		System.out.println(y%(x%y));
//		System.out.println((x%y) % (y%(x%y)));
		
		// 2. �ݺ����� ������ ���� 
		int r, s ;		
//		r = x%y;
//		s = y;
//		while (r%s!=0){
//			r = r % s;
//			s = s % r;
//		}
//		System.out.println("r := " + r + " , s := " + s);
		
		// 3. ���� �������� 0�� �� ��Ȳ�� ȸ���ϴ� �ڵ�� ����
		x = 78696;
		y = 19332 ;
		
		r = x%y;
		s = y;
		while (s != 0 && r%s!=0 ){
			r = r % s;
			s = s % r;
			System.out.println("r := " + r + " , s := " + s);
		}
//		System.out.println("r := " + r + " , s := " + s);
		
		int result ;
		result = EuclideanTest(1071, 1029);
		System.out.println(result);
		
		result = EuclideanTest(78696, 19332);
		System.out.println(result);
	}
}
