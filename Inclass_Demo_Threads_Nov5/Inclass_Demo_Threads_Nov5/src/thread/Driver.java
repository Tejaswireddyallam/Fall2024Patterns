package thread;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread objectThread1 = new DemoThread();
		System.out.println(objectThread1.getState());
		DemoThread2 objectThread2 = new DemoThread2();
		DemoThread03 objectThread3 = new DemoThread03();
		
		objectThread2.setPriority(Thread.MAX_PRIORITY);;
		objectThread1.setPriority(Thread.MIN_PRIORITY);
		objectThread3.setPriority(Thread.NORM_PRIORITY);
	//	objectThread3.setPriority();
		
		objectThread1.start();
		objectThread2.start();
		objectThread3.start();
		
		
	}

}
