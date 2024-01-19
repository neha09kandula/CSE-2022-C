import java.util.StringTokenizer;

public class wordcount {
    public static void main(String[] args) {
        String inputString = "Java lab";

        StringTokenizer tokenizer = new StringTokenizer(inputString);

        int wordCount = tokenizer.countTokens();
        System.out.println("given string is:"+inputString);
        System.out.println("Number of words: " + wordCount);
    }
}
