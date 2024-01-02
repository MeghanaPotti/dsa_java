package oops;

//public class Constructor {               // constructor is used for default execution
//	
//	Constructor() {
//		
//		System.out.println("Default constructor");
//	}
//
//	public static void main(String[] args) {
//		
//		Constructor obj = new Constructor();
//
//	}
//
//}



	
	 class Constructor {
		  
		 int num;
		 String name;
		 
		 Constructor() {
			  num=1;
			 name="Meghana"; 		 
			 display();
		 }
		 
		 Constructor(int n, String name) {  // parameterized constructor
			  num=n;
			 this.name=name;      // used for unique variable identification
			 display();
		 }
		
		void display() {
		System.out.println("Student id is "+num);
		System.out.println("Students name is "+name);
		}
		
		public static void main (String[] args) {
			Constructor object = new Constructor();
//			object.display();
			Constructor object1 = new Constructor(3, "satya");
			
		}
	}
