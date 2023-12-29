package frames;
import java.io.FileWriter;
import java.io.IOException;
public class file1 {
public static void main(String[] args) {
try {
FileWriter Writer= new FileWriter("myfile.txt");
Writer.write("java is one of the worst subject i have seen!");
Writer.close();
System.out.println("it is written successfully");
}
catch (IOException e) {
System.out.println("An error has occurred");
e.printStackTrace();
}
}

}