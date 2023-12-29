package Frame;
import java.util.Scanner;

public class Area 
{
interface area{
       public void printArea();
}  

 class Rectangle implements area{
   public void printArea(){
         try (Scanner input = new Scanner(System.in)) {
			System.out.println(" enter the length");
			 System.out.println(" enter the breadth");
			 int l=input.nextInt();
			 int b=input.nextInt();
			 int arearec=l*b;
    System.out.println(" area of rectangle:"+arearec);
		}
         System.out.println(" ");
     }
     
 }       
class Triangle implements area{
  public void printArea(){
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter the length");
  
			System.out.println("enter the breadth");
			 int l=input.nextInt();
			 int b=input.nextInt();
			double areatri= 0.5*l*b;
			System.out.println(" area of triangle:"+areatri);
		}
        
    }
}
class Main{
    public void main(String args[]){
        Rectangle obj=new Rectangle();
        obj.printArea();
        Triangle t =new Triangle();
        t.printArea();
    }
}

}
