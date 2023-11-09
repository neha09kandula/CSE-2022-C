interface firstAnimal
{
Public void animalSound()
}
interface secondAnimal
{
Public void sleep()
}
class Dog implements firstAnimal,secondAnimal
{
Public void animalSound()
{
System.out.println("it barks");
}
Public void sleep()
{
System.out.println("it is sleeping");
}
}
class Main()
{
public static void main(String[] args)
{
Dog d1 = new Dog();
d1.animalSound();
d1.sleep();
}
}
