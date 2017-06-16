public class ContinueWithLabelExam {
	public static void main(String[] args) {
		String searchMe = "Look for a substring in me";
		String substring = "sub";
		boolean foundIt = false;
		
		int max = searchMe.length() - substring.length();
		
		test:
		for (int i = 0; i <= max; i++) {
			int n = substring.length();
			int j = i;
			int k = 0;
			while (n-- != 0) {
				if (searchMe.charAt(j++) != substring.charAt(k++)) {
					continue test; // test:가 있는 곳의 처음 블록을 수행한다.
				}
			}
			foundIt = true;
			break test; // test:가 있는 곳의 최상위 블록을 탈출한다.
		}
		System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
}
