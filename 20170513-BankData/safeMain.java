/*
	�̳༮���� ������ �� ���� Ŭ������ �����?
	������ ǥ�� �� �ְ�, safeKeeperA, �� ���� safeKeeperB �� Ŭ������ ���� �մϴ�.

*/
public class safeMain {
	public static void main(String[] args) {
		System.out.println("����: "+BankData.bank.getMoney());
		
		safeKeeperB sKB = new safeKeeperB();
		safeKeeperA sKA = new safeKeeperA();
		sKA.start();
		sKB.start();
	}
}