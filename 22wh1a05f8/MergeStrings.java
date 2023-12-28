package my_java_projects;
/*10. (a)Given two strings s1 and s2, your task is to merge those strings to form a new merged
string*/

import java.util.*;
public class MergeStrings {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string (s1): ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string (s2): ");
        String s2 = sc.nextLine();
       String a=s1.concat(s2);
       System.out.println("after concatination the string is:"+a);
    }
}
