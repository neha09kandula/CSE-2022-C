public class methodoverloading{
public int sum1(int x,int y){
return(x+y);
}
public int sum1(int x,int y,int z){
return(x+y+z);
}
public int sum1(double x,double y){
return(x+y);
}
public static void main(String args[]){
sum1 s=new sum1();
System.out.println(s.sum1(6,4));
System.out.println(s.sum1(6,4,2));
System.out.println(s.sum1(6,4));
}
}
