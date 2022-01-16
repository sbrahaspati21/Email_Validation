package Validation_Of_Email_ID;

import java.util.*;
import java.util.regex.*;  

public class Validation{  
    public static void main(String args[]){  
     
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Email You want to Validate : ");
      String email_id = sc.next();
        
        String regex = "^(.+)@(.+)com"; 
      
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email_id);  
           
        System.out.println("Email Id : " + email_id +" is valid : "+ matcher.matches()+"\n" );  
        }     
    }  