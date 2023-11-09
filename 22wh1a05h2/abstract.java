Abstract class Animal()
{
    Abstract void MakeSound()
    public void Eat(){
        system.out.println("I can eat");
    }
class Dog extends Animal(){
    public void MakeSound(){
        system.out.println("bark");
    }
}
class Main()
{
    public static void Main(String[] args)
    {
        Dog d1 = new dog();
        d1.MakeSound(); 
        d1.Eat();
    }
}
}
