class BreakWithLabelExam {
	public static void main(String[] args) {
		int[][] arrayOfInts = {
				{ 32, 87, 3, 589 },
				{ 12, 1076, 2000, 8 },
				{ 622, 127, 77, 955 }
				};
		int searchfor = 3;
		int i;
		int j = 0;
		boolean foundIt = false;
		
		search:
			for (i = 0; i < arrayOfInts.length; i++) {
				for (j = 0; j < arrayOfInts[i].length; j++) {
					if (arrayOfInts[i][j] == searchfor) {
						foundIt = true;
						break search;
						}
					}
				}
		// search라는 레이블이 걸린 부분을 기준으로 그 하부 블록을 탈출한다.
		// 따라서 아래의 if(foundit) 문장을 수행한다.
		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
				System.out.println(searchfor + " not in the array");
		}
	}
}
