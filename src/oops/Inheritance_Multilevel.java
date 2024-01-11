package oops;

class GrandChild {
	 void crawl() {
		  System.out.println("Crawling");
		 }
	}
class Child extends GrandChild {
	void study() {
		System.out.println("Studying");
	}
	
	void play() {
		System.out.println("Playing");
	}
}
class Parent extends Child {
	void work() {
		System.out.println("working");
	}
}
class GrandParent extends Parent {
	void relax( ) {
		System.out.println("Relaxing");
	}
	
	void read() {
		System.out.println("reading");
	}
}

public class Inheritance_Multilevel {

	public static void main(String[] args) {
		
		GrandParent object = new GrandParent();
		object.crawl();
		object.study();
		object.work();
		object.relax();
		object.play();
		object.read();
	}

}
