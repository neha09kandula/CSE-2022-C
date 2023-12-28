package Frame;

public class vehicle
{

class Vehicle{
    void drive(){
        System.out.println(" car driving");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println(" Reparing a car");
    }
    
}
class Main{
    public void main(String args[]){
        Car obj=new Car();
        obj.drive();
    }
}

}
