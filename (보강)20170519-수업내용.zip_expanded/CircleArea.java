public class CircleArea {
	public static void main(String[] args) {
		double R = 100.0 ;//지름
		double circle_length; 
		circle_length = R * Math.PI ;
		System.out.println(circle_length);
		// 기회다. 원의 넓이를 구해보자.
		double circle_area ;
		circle_area = (R/2)*(R/2)*Math.PI ;
		System.out.println("지름이 100인 원의 넓이는 "+circle_area +
				"입니다.");
	}
}
