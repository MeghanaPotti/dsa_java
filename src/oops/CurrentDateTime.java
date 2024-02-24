package oops;
//import java.time.LocalDateTime;
//
//public class CurrentDateTime {
//	public static void main(String[] args) {
//
//	LocalDateTime object = LocalDateTime.now();
//	System.out.println("Present date and time is "+object);
//	}
//}

import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Present date and time is " + currentDateTime);
    }
}

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class CurrentDateTime {
//    public static void main(String[] args) {
//        // Get the current date and time
//        LocalDateTime currentDateTime = LocalDateTime.now();
//
//        // Format the date and time using DateTimeFormatter
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = currentDateTime.format(formatter);
//
//        // Print the formatted date and time
//        System.out.println("Current date and time: " + formattedDateTime);
//    }
//}



