class Sample {
    int add(int a, int b){
        return (a + b);
    }

    int add(int a, int b, int c) {
        return (a + b + c);
    }
}

public class Demo {
    public static void main(String[] args) {
        Sample obj1 = new Sample();
        System.out.println(obj1.add(10, 20));     
        System.out.println(obj1.add(10, 20, 30));   
    }
}
