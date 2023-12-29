package frames ;
import java.io.File;
import java.io.IOException;
public class file {
public static void main(String[] args) {
try {
File Obj = new File("myfile.txt");
if (Obj.createNewFile()) {
System.out.println("File created");
}
else {
System.out.println("File already exists.");
}
}
catch (IOException e) {
System.out.println("error occurred.");
e.printStackTrace();
}
}

}