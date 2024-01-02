import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Stringss{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String s=scanner.nextLine();
        String s1=" ";
        char ch;
        for(int i=0;i<s.length();i++) {
            ch=s;
            s1=ch+s1;
        }
        System.out.println(s1);
    }
     
}