public class multiple_object
{
    int x=15;
    int y=10;
    int z=5;
    int a=20;
    public static void main(String args[])
    {
        multiple_object object1 = new multiple_object();
        System.out.println(object1.x);
        multiple_object object2 = new multiple_object();
        System.out.println(object2.y);
        multiple_object object3 = new multiple_object();
        System.out.println(object3.z);
        multiple_object object4 = new multiple_object();
        System.out.println(object4.a);
    }
}