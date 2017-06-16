public class conversionStringToStringBuffer00 implements Runnable {
	static int i = 0; // static을 빼면 어떻게 되는지 확인해볼 것
	static String xx = new String("Hello");
	
	public void run(){
		for (; i<20; i++) {
			// 아래 부분을 주석처리하고 아래의 try..catch를 활성해보자. 
			System.out.println(Thread.currentThread().getName() +"/"+ xx + i);
/*
			try {
				Thread.sleep(125L);
				System.out.println(Thread.currentThread().getName() +"/"+ xx + i);
			} catch (InterruptedException e) {
				e.printStackTrace(System.err);
			}
*/			
		}
		//System.out.println(xx);
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new conversionStringToStringBuffer00());
		Thread t2 = new Thread(new conversionStringToStringBuffer00());
		Thread t3 = new Thread(new conversionStringToStringBuffer00());
		Thread t4 = new Thread(new conversionStringToStringBuffer00());
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
