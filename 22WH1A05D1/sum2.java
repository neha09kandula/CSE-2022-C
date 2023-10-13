public class sum2{
public int sum2(int x,int y){
return(x+y);
}
public int sum2(int x,int y,int z){
return(x+y+z);
}
public int sum2(double x,double y){
return(x+y);
}
public static void main(String args[]){
sum2 s=new sum2();
System.out.println(s.sum2(6,4));
System.out.println(s.sum2(6,4,2));
System.out.println(s.sum2(6,4));
}
}
