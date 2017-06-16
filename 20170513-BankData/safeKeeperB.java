
public class safeKeeperB extends Thread {
	@Override
	public void run() {
		synchronized (BankData.bank) {
			BankData.bank.saveMoney(3000);
			System.out.println("3000�� �Ա�: "+BankData.bank.getMoney());
			System.out.println("Release safeKeeperA ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			safeKeeperA sKA = new safeKeeperA();
			sKA.wakeUp();
		}
	}
}
/*
	�̳༮���� ������ �� ���� Ŭ������ �����?
	������ ǥ�� �� �ְ�, safeKeeperA, �� ���� safeKeeperB �� Ŭ������ ���� �մϴ�.

*/