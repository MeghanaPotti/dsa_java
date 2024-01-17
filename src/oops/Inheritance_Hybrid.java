package oops;

class Numbers {
	void display() {
		System.out.println("Real numbers");
	}
}

class IrrationalNumbers extends Numbers {
	void display1() {
		System.out.println("Irrational numbers");
	}
}

class RationalNumbers extends Numbers {
	void show() {
		System.out.println("Rational numbers");
	}
}

class NonIntegers extends RationalNumbers {
	void view() {
		System.out.println("Non Integer Numbers");
	}
}

class Integers extends RationalNumbers {
	void visible() {
		System.out.println("Integer numbers");
	}
}

public class Inheritance_Hybrid {

	public static void main(String[] args) {
		
		NonIntegers obj = new NonIntegers();
		obj.display();
		obj.show();
		obj.view();
		
		Integers obj1 = new Integers();
		obj1.display();
		obj1.show();
		obj1.visible();

	}

}
