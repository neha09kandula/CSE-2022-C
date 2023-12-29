package expection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filehandling {
	

	    public static void main(String[] args) {
	        String inputFilePath = "input.txt";
	        String outputFilePath = "output.txt";

	        writeToFile(outputFilePath, "Hello, this is a file handling example in Java!");

	        String content = readFromFile(inputFilePath);
	        System.out.println("Content read from file:\n" + content);
	    }

	    private static void writeToFile(String filePath, String content) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
	            writer.write(content);
	            System.out.println("Content has been written to the file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static String readFromFile(String filePath) {
	        StringBuilder content = new StringBuilder();

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                content.append(line).append("\n");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return content.toString();
	    }
	}


