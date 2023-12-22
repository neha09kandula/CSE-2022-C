package internal;

public class check {

    static String rev = "";
    static boolean ans = false; // initially

 public boolean isPalindrome(String str) {
        for (int i = str.length() - 1; i >= 0; i--) { 
            rev = rev + str.charAt(i);
        }
        if (rev.equals(str)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "abcd";
        check obj = new check();
        System.out.println(obj.isPalindrome(str));

    }

}