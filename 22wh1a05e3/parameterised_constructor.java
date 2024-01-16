package java_5e3;

public class parameterised_constructor {
    private int y; // Declare y as a member variable

    public parameterised_constructor(int y) {
        this.y = y; // Assign the parameter y to the member variable y
    }

    public static void main(String[] args) {
        parameterised_constructor obj1 = new parameterised_constructor(10); // Provide a value for y
        System.out.println(obj1.y);
    }
}
