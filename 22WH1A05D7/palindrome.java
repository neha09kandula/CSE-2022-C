public class palindrome
{    
    public static void main(String[] args) {    
        String string = "mom";    
        boolean rev = true;       
        string = string.toLowerCase();
        System.out.println("given string is"+string);
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                rev = false;    
                break;    
            }    
        }    
        if(rev) 
        	
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}  