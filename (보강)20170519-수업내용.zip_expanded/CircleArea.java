public class CircleArea {
	public static void main(String[] args) {
		double R = 100.0 ;//����
		double circle_length; 
		circle_length = R * Math.PI ;
		System.out.println(circle_length);
		// ��ȸ��. ���� ���̸� ���غ���.
		double circle_area ;
		circle_area = (R/2)*(R/2)*Math.PI ;
		System.out.println("������ 100�� ���� ���̴� "+circle_area +
				"�Դϴ�.");
	}
}
