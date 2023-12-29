package cse225f1;
import java.io.File;
import java.io.IOException;
//creating file
public class file_handlingg {

public static void main(String[] args) {
// TODO Auto-generated method stub
try {

File Obj = new File("myfile.txt");
if (Obj.createNewFile()) {
System.out.println("File created: "

+ Obj.getName());
}
else {
System.out.println("File already exists.");
}
}
catch (IOException e) {
System.out.println("An error has occurred.");
e.printStackTrace();
}
}

}