package cse225d8;

public class Throw {    
    public static void validate(int age) {  
        if(age<18) {  
            throw new ArithmeticException("not eligible to vote");    
        }  
        else {  
            System.out.println("eligible to vote");  
        }  
    }  
   
    public static void main(String args[]){  
         validate(13);  
        System.out.println("rest of the code");    
  }    
}    
