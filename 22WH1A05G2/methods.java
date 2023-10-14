class addition{
    int x;
    int y;

    void add(){
        System.out.println("The sum of the two numbers is: ");
        System.out.println(x+y);
    }
}
public class methods{
    public static void main(String args[]){
        addition add1 = new addition();
        add1.x = 2;
        add1.y = 4;
        add1.add();
    }
}
