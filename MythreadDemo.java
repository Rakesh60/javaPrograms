

public class MythreadDemo {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
	}

}

class MyThread extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("OwnThread");
		System.out.println(t);
	}
}
