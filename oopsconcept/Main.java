package oppsConcept;

public class Main {

	public static void main(String[] args) {

		
		  Bank b = new Bank();
		  b.customerPin();
		  b.printInfo();
		 

		// Cannot instantiate abstract class
		// AbstractExample a = new AbstractExample();

		
		  C c = new C(); c.printInfo();
		  
		  //Parent objectname = new Childclass();
		  Interface i = new C();
		  i.printInfo1(); i.printInfo();
		 

		Child ex = new Child();
		ex.printInfo();

		Vehicle v = new Car("BMW", "1000", 35000);
		System.out.println(v.getBrand());

	}

}
