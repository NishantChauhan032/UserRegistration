import java.util.*;
import java.util.regex.*;
public class UserRegistration{
  public static void main(String[] args){
    System.out.println("Welcome to User Registartion");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First Name: ");
    String firstName = sc.next();
      
          while(!Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName)){
             System.out.println("Invalid Input. Please enter a correct input for first name: ");
             firstName =  sc.next();
          }

     System.out.println("Enter the Last Name: ");
     String lastName = sc.next();
       
          while(!Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName)){
             System.out.println("Invalid Input. Please enter a correct input for last name: ");
             lastName =  sc.next();
          }
     
     System.out.println("Enter the Email ID: ");
     String emailId = sc.next();
       
          while(!Pattern.matches("^[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)?@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$",emailId)){
             System.out.println("Invalid Input. Please enter a correct input for Email ID: ");
             emailId =  sc.next();
          }
      sc.nextLine();      
      System.out.println("Enter the Mobile Number: ");
      String mobileNo = sc.nextLine();

          	while(!Pattern.matches("[0-9]{2}[ ][0-9]{10}",mobileNo)){
             System.out.println("Invalid Input. Please enter a correct input for Mobile Number: ");
             mobileNo =  sc.nextLine();
          }
   }
 }
