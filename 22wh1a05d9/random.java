package task;
import java.util.Random;
import java.util.*;
public class random {

	public static void main(String[] args) {
		        int min = 1;
		        int max = 100;
		        Scanner input=new Scanner(System.in);
		        Random random = new Random();
		        int randomNumber = random.nextInt(max - min + 1) + min;
		        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
                System.out.println("guess the random number that was displayed:");
                int guess_no=input.nextInt();
                if (guess_no>randomNumber)
                {
                	System.out.println("The number you guessed is too high");                	
                }
                else if (guess_no<randomNumber)
                {
                	System.out.println("The number you guessed is too low ");
                }
                else
                {
                	System.out.println("your guess is correct");
                }
            	
                }
                
                
	}
		