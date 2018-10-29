import java.util.ArrayList;

//Single
public class MyClass extends Thread {
	ArrayList<Integer> numbers  = new ArrayList<Integer>();
	int min =0;
	int max = 5;
	public void run() {
		System.out.println("MyClass running");
		System.out.println(this.add(5));
		System.out.println(this.add(6));
		System.out.println(this.add(6));
		this.remove(3);
		this.remove(6);
		this.printArray();
		
	}
	
	public  boolean add(Integer num) {
		if(!this.numbers.contains(num))
		     return this.numbers.add(num);
		return false;
	}
	
	public  boolean remove(Integer num) {
		return this.numbers.remove(num);
	}
	
	public void printArray() {
		for(int i=0;i<this.numbers.size();i++) {
			System.out.println("index: " +i+ numbers.get(i));
		}
	}
	
}

//Runnble
/*
 * public class MyClass implements Runnable { int num = 0; public void run(){
 * //this.add(5); System.out.println("MyClass running"); }
 */

//}

//Multi
