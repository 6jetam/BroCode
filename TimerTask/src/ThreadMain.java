
public class ThreadMain {
	public static void main (String[]args) throws InterruptedException {
		
//		System.out.println(Thread.activeCount());
		
//		Thread.currentThread().setName("Maiiiiin");
//		System.out.println(Thread.currentThread().getName());
		
//		Thread.currentThread().setPriority(1);
//		System.out.println(Thread.currentThread().getPriority());
		
//		System.out.println(Thread.currentThread().isAlive());
		
//		for (int i=3;i>0;i--) {
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//		System.out.println("you are done");
//	
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println(thread2.isAlive());
		
	}

}
