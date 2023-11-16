public class add
{
public int add(int x,int y){
return (x+y);
}
public int add(int x,int y,int z){
return (x+y+z);
}
public double add(double x, double y){
return (x+y);
}

public static void main(String args[])
{
add s=new add();

System.out.println(s.add(1,2));
System.out.println(s.add(1,2,3));
System.out.println(s.add(14,2111));
//System.out.println(j.y);
}
}