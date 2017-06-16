// 람다 식으로 구성해봄
public class conversionStringToStringBuffer02 {
	interface append_string {
		String printTwoString(String a, String b) ; 
	}
	public String twoString (String a, String b, append_string c) {
		return c.printTwoString(a, b);
	}
	public static void main(String[] args) {
		conversionStringToStringBuffer02 cSTSB = new conversionStringToStringBuffer02();
		append_string appendStr = (pp, qq)->pp+qq;
		
		System.out.println(cSTSB.twoString("hello ", "Java",appendStr));
	}
}
