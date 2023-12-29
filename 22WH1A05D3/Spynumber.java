package cse225d3;

public class Spynumber {
    public static void main(String[] args) {
        int number = 1124;
        boolean isSpy = isSpyNumber(number);
        System.out.println(isSpy);
    }
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;  
            sum += digit;          
            product *= digit;      
            num /= 10;            
        }
        return sum == product;
    }
}