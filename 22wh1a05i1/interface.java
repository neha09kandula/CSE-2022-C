interface Animal
{
    public void animalSound();
    public void sleep();
}
class Dog implements Animal
{
    public void animalSound()
    {
        System.out.println("It barks");
    }
    public void sleep()
    {
        System.out.println("It is sleeping zzz....");
    }
}
class AnimalMain
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.animalSound();
        d1.sleep();
    }
}