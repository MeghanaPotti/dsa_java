package exceptions;

public class TryMultipleCatch {

	public static void main(String[] args) {
		
		 try{    
	           
				int array[] = new int[10];    
	            array[10] = 30/0;    
	        }    
//	        catch(ArithmeticException e){  
//	            System.out.println(e);  
//	        }    
//	        catch(ArrayIndexOutOfBoundsException e){  
//	            System.out.println(e);  
//	        }    
//	        catch(Exception e){  
//	            System.out.println(e);  
//	        }    
   
		 catch(Exception | ArithmeticException | ArrayIndexOutOfBoundsException e){  
	            System.out.println(e);  
		  }
	}

}
