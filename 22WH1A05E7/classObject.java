//1.Write a program to declare a class and create object
class square{
    int length;
    int breadth;
}
public class classObject {
    public static void main(String args[]){
        square sq1 = new square();
        double area;
        sq1.length = 10;
        sq1.breadth = 10;
        area = sq1.length * sq1.breadth;
        System.out.println(sq1.length);
        System.out.println(sq1.breadth);
        System.out.println(area); 
    }
}
