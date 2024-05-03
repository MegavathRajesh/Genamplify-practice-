package methodoverloading;

public class mallareddy {
	
	void std() {
		
		System.out.println("hi am the Student 1  in mallareddy callage ");
	}

	void std(int a) {
		
		System.out.println("Here The Value of a is "+a );
		
		System.out.println("hi am the Student 1  in mallareddy callage with int value ");
	}
	
	void std(String a) {
		
		System.out.println("Here the string Value is "+ a);
		
		System.out.println("hi am the Student 1  in mallareddy callage with String Value ");
	}
	
	void std(int x, int y) {
		
		System.out.println( x+y);
		
		
		System.out.println("hi am the Student 1  in mallareddy callage with 2 int value ");
	}


	public static void main(String[] args) {
		
		mallareddy obj = new mallareddy();
		
		obj.std();
		obj.std(3);
		obj.std("sri Anjaneya Swami");
		obj.std(5, 8);
		
	}
	
	
}
