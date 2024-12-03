package thread;

public class DemoThread2 extends Thread {
	public void run() {
		for(int i=1;i<=4;i++) {
			System.out.println("Demo thread2 is running:"+i);
		}
	}
}
