package exceptions;

public class TryCatch {

	public static void main(String[] args) {

           try {
        	   
        	   int a=10, b=0;
        	   System.out.println("dividing by 0 "+(a/b));
          	   
           }
 catch (Exception e) {
	 System.out.println("Catch method exception is "+e);
 }
           
       finally {
    	   System.out.println("End of calculation");
       }

//		 int a=10, b=0;
//  	   System.out.println("dividing by 0 "+(a/b));
//  	   System.out.println("End of calculation");
	}
}
