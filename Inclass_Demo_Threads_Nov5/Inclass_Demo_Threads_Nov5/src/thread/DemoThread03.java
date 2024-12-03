package thread;

public class DemoThread03 extends Thread {
	
	public void run() {
		for(int i=1; i<=4;i++) {
			try {
				System.out.println("I'm sleeping thread 03");
				Thread.sleep(1000);
				System.out.println("I am thread3 and I woke up after 1sec ");
			} catch(InterruptedException e) {
			   e.printStackTrace();
			}
			
			System.out.println("Demothread03 is running:"+i);
//			double j = i*i+i*Math.sqrt(i);
			
		}
	}
}
