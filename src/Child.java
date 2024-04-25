
class Parent{
	void message() {
		System.out.println("Message From Parent");
	}
	
} 

public class Child extends Parent {
	
	
	void message() {
		super.message();
		System.out.println("Message From Child");
		//super.message();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
	//	Child p=(Child) new Parent();
		c.message();
		//c.message();
	}

}
