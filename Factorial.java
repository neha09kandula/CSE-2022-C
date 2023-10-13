import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
else 
{
            long factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        scanner.close();
    }
    public static long calculateFactorial(int n) 
{
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) 
{
            factorial *= i;
        }
        return factorial;
    }
}
