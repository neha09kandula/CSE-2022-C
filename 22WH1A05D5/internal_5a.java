package frames;

import java.util.*;

class MyException extends Exception {
    void getdata(int data) throws MyException {
        if (data % 2 != 0) {
            throw new MyException();
        } else {
            System.out.println("Even, so no exception");
        }
    }
}

public class internal_5a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            MyException e = new MyException();
            e.getdata(n);
        } catch (MyException me) {
            System.out.println("It is odd -> so, raised my exception");
        
        }
    }
}