package bvrith;
import java.util.Scanner;
public class AREA {
	float r;
    float l;
    float b;
    Scanner sc = new Scanner(System.in);
    
 
  void carea(){
      System.out.println(" enter the radius");
      r=sc.nextFloat();
     float area =  r * r;
     System.out.println(" circle area :"+area);
  }
  void rarea(){
      System.out.println(" enter length");
      System.out.println(" enter breadth");
       l=sc.nextFloat();
       b=sc.nextFloat();
     float arearec = l * b;
      System.out.println(" rectangle area:"+arearec);
  }
  class Main{
	public static void main(String[] args) {
		AREA obj=new AREA();
        obj.carea();
        obj.rarea();

	}
  }
}


