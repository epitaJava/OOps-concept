package oppsConcept;

import java.util.Scanner;

abstract class AbstractExample {
		
	abstract void customerPin();
	int value;
	void printInfo() {
		System.out.println("Abstract class");
	}
}

class Bank extends AbstractExample{
	
	Bank(){
		super.printInfo();
	}
	@Override
	void customerPin() {
		System.out.print("Enter your pin:");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		System.out.print("Enter amount:");
		float amt = sc.nextFloat();
		System.out.print("You entered amount:"+ amt);
		System.out.println("Withdraw cash & card!");
		sc.close();
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("Extended class");
	}
	
}
