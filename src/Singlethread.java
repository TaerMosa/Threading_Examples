import java.util.ArrayList;

public class Singlethread {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.run();
		MyClass test = new MyClass();
		test.run();
		int number = 0;
		ArrayList<MyClass> pool = new ArrayList<MyClass>();
		for(int i=0; i<10 ;i++) {
			pool.add(new MyClass());
		}
		for(int j=0; j<10 ;j++) {
			pool.get(j).start();
		}
		
		

	}

}
