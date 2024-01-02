package oops;

//public class Constructor {
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
		
		int num=1;
		String name="Meghana";
		
		void display() {
		System.out.println("Student id is "+num);
		System.out.println("Students name is "+name);
		}
		
		public static void main (String[] args) {
			Constructor object = new Constructor();
			object.display();
		}
	}
