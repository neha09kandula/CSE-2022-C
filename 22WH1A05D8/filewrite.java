package cse225d8;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

public static void main(String[] args) {
      try{
          FileWriter Writer= new FileWriter("myfile.txt");
          Writer.write("File in a Java ");
          Writer.close();
          System.out.println("Successfully written.");
         }
         catch (IOException e) {
              System.out.println("An error has occurred.");
           }
  }

}