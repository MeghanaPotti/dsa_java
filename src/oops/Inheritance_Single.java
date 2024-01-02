package oops;

 class ParentClass {
	 
	static int bookPrice = 100; 
	static String bookName = "ABC";
	
	public static void printBookDetails() {
		
		System.out.println("Book name is "+bookName);
		System.out.println("Book price is "+bookPrice);
		
	}
	
// Access modifiers	
//	private void privateParentMethod() {   
//		System.out.println("This is private parent method");
//	}
	protected void protectedParentMethod() {
		System.out.println("This is protected parent method");
	}


}

 class ChildClass extends ParentClass {
	public static void childMethod() {
		printBookDetails();		// calling ParentClass method from ChildClass
	}
	
	public void displayChildMethod() {
		System.out.println("This is childClassMethod");
	}
}

public class Inheritance_Single {

	public static void main(String[] args) {
		ChildClass p = new ChildClass();
		ChildClass.childMethod();
        p.displayChildMethod();
     //   p.privateParentMethod();
        p.protectedParentMethod();
//        System.out.println("Book price is "+p.bookPrice);
	}
	
	

}


