
public class safeKeeperA extends Thread{
	@Override
	public void run() {
		//��������ȭ
		synchronized (BankData.bank) {
			try {
				System.out.println("Wait safeKeeperA");
				BankData.bank.wait();//�����带 �������
			} catch (Exception e) {
				e.printStackTrace();
			}
			BankData.bank.minusMoney(5000);
		}
		System.out.println("safeKeeperA : Withdrawal 5000 Won : "+BankData.bank.getMoney());
	}
	
	public void wakeUp(){
		synchronized(BankData.bank){
			System.out.println("Release SafeKeeperA");
			BankData.bank.notify();
			//BankData.bank.notifyall(); �� ��� �ϸ� ��� �����带 ��� �����.
		}
	}
}
