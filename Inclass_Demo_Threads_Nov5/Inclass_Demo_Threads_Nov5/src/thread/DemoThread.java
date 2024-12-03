package thread;

public class DemoThread extends Thread {
	
	public void run() {
		for(int i=1; i<=4;i++) {
			System.out.println("Demo thread is running:"+i);
			double j = i*i+i*Math.sqrt(i);
		}
	}
}
