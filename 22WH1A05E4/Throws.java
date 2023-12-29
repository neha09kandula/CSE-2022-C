package cse225e4;
import java.io.IOException;
 class throwks {
void myMethod(int num)throws IOException,
ClassNotFoundException{
if(num==1)
throw new IOException("IO Exception Occurred");
else
throw new
ClassNotFoundException("ClassNotFoundException");
}
}
public class Throws{
public static void main(String args[]){
try{
Throws obj=new Throws();
obj.myMethod(1);
}catch(Exception ex){
System.out.println(ex);
}
}
private void myMethod(int i) {
}
}
