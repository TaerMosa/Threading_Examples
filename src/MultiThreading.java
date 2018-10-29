import java.util.ArrayList;

public class MultiThreading {

	public static void main(String[] args) {
		ArrayList<MyThread> threadpool = new ArrayList<MyThread>();
		int i = 0;
	     MyThread t1 =   new MyThread("One");
	     MyThread  t2 = new MyThread("Two");
	     MyThread t3 = new MyThread("Three");
	     
	     threadpool.add(t1);
	     threadpool.add(t2);
	     threadpool.add(t3);
}
}
	  