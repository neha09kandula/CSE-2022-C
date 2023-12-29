package cse225d3;

public class MergeStrings {
    public static void main(String[] args) {
        String s1 = "Hii, ";
        String s2 = "Kyathi!";
        String mergedString = mergeStrings(s1, s2);
        System.out.println(mergedString);  // Outputs: Hello, world!
    }
    public static String mergeStrings(String s1, String s2) {
        return s1 + s2;
    }
}