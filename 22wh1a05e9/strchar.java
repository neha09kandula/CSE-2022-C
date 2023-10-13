package Javaprograms;

public class strchar {
	public strchar(){
		
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "Meghana";
    char ch = str.charAt(3);
    System.out.println(ch);
    char[] dst = new char[10];
    str.getChars(3,6,dst,0);
    System.out.println(dst);
    String str1 = "Hello";
    String str2 = "World";
    char res1 = str1.charAt(0);
    char res2 = str2.charAt(2);
    System.out.println(res1);
    System.out.println(res2);
    
	}

}
