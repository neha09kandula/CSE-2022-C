import java.util.Scanner;

public class spy {

    int n;
    int s = 0;
    int p = 1;

    public spy() {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = data.nextInt();
    }

    public int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

    public int productOfDigits(int num) {
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num = num / 10;
        }
        return product;
    }

    public void checkSpyNumber() {
        s = sumOfDigits(n);
        p = productOfDigits(s);

        if (s == p)
            System.out.println("It is a spy number");
        else
            System.out.println("It is not a spy number");
    }

    public static void main(String[] args) {
        spy spy = new spy();
        spy.checkSpyNumber();
    }
}

