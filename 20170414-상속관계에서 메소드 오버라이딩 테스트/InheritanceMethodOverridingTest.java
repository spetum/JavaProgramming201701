class A {
	public void paint() {
		System.out.println("here is paint() in Class A");
		this.draw();
	}
	public void draw() {
		System.out.println("here is draw() in Class A");
	}
}
class B extends A {
	public void draw() {
		System.out.println("here is draw() in Class B; Method Overriding!");
	}
}
class BB extends A {
//	public void paint () {
//		System.out.println("here is paint() in Class BB; Method Overriding!");
//		draw() ;		
//	}
	public void draw() {
		System.out.println("here is draw() in Class BB; Method Overriding!");
		System.out.println("and then call super.draw() ->");
		super.draw();
		System.out.println("<-return froml super.draw()");
	}
}
public class InheritanceMethodOverridingTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// 여기까지가 시험문제
	
//		A aa = new BB() ;
//		aa.paint();		
	}
}
