/*
Authour - Salma Danane
Project Name - Problem Set unit 3: Email Validation and Parser 80%
Date Created - March 28th 2026
Date last modified - April 7th 2026
*/ 

import java.util.Scanner;


public class ProblemSet {


       public static void main(String args[]) {


       Scanner input = new Scanner (System.in); 


       System.out.print("Enter your email address: "); /* This is the prompt used to accept an input from the user */


       String email;
       email = input.nextLine(); /* This variable will be used to store the user input in a String */


       String userName = email.substring(0,email.indexOf("@"));  /* This is a subtring of the users' username from their email (before the @ symbol) */
       String domain = email.substring(email.indexOf("@")); /* This string will store the domain of the input, it stores the value of the email from the @ symbol and the rest */
       String domainAfterDot = email.substring(email.indexOf(".") + 1); /* This will take the string from the first dot (in the username) to the end of the email */
       String domainAfterFirstDot = domainAfterDot.substring(domainAfterDot.indexOf(".") + 1); /* This will create a substring copy of the domainAfterDot variable after the period (second period in overall email) */


       int subStringCount = userName.length(); /* This variable will get length of the substring using the .length() function */
       int domainAfterFirstDotCount = domainAfterFirstDot.length(); /* This variable will be used to store the length of the domain after the dot (basically after the @ symbol)  */
        int emailCount = email.length();  /* This variable will get the length of the user input */

       if (emailCount == 0){ /* This checks to see if the length of the characters in the email is equal to zero, if it is then it will output invalid, and if its more than 0 it will continue to the rest of the code */


               System.out.println("Invalid");


       }
      
       else if (email.contains(" ")) { /* If the code contains a space, then the email is invalid, I checked for this using the .contains() function */
              
               System.out.println("Invalid");


       }


       else if (email.endsWith(".") || email.startsWith(".")){ /* This checks to see if the email starts or ends with a period (with the .startsWith() and .endsWith() function) and if it does it will output an invalid */
           
       System.out.println("Invalid");


       }
       else if (subStringCount < 1 || subStringCount > 64){ /* if the username(local) is less than 1 or more than 64 characters then the email is invalid */

       System.out.println("Invalid");

       }

       else if (domainAfterFirstDotCount <= 1 || domainAfterFirstDotCount > 6){ /* This checks to see if the domain after the period is less than two (equal to 1) or more than 6 characters - if it is than the code will be invalid*/


       System.out.println("Invalid");
       }


       else if (!domain.contains(".")){ /* If the emails domain does not contain a period, than the email shall be invalid */


               System.out.println("Invalid");
       }


       else if (email.contains("@")) { /* If the code passes all of the other requirements, then the code will finally check to see if it has an @ symbol as well, and it will output valid */


               System.out.println("Valid");
      

       }
       else { /* If the code doesnt pass any of the other requirements then it'll just be incorrect as a final path */


               System.out.println("Invalid (final else)");
       }

       input.close(); /* Closing my scanner */

        /* End of code */

       }


}