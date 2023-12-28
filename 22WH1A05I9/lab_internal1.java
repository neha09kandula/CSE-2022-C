 #1. Write a java program to read product details from customer like (product name, quantity,
and cost of the product), now display the product which is having highest value.

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] productName = new String[n];
        int[] quantity = new int[n];
        double[] cost = new double[n];
        double[] value = new double[n];
        double max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter product name, quantity, and cost of the product:");
            productName[i] = scanner.next();
            quantity[i] = scanner.nextInt();
            cost[i] = scanner.nextDouble();
            value[i] = quantity[i] * cost[i];
            if (value[i] > max) {
                max = value[i];
                index = i;
            }
        }
        System.out.println("The product with the highest value is " + productName[index] + " with a value of $" + String.format("%.2f", max));
    }
}



#2. Write a java program to create an interface named Shape that contains two integers and an
empty method named printArea (). Provide three classes named Rectangle, Triangle and
Circle such that each one of the classes implements the class Shape. Each one of the classes
contains only the method printArea () that prints the area of the given shape

    import java.util.Scanner;
interface Area{
       public void printArea();
}  

 class Rectangle implements Area{
   public void printArea(){
         Scanner sc = new Scanner(System.in);
         System.out.println(" enter the length");
         System.out.println(" enter the breadth");
         int l=sc.nextInt();
         int b=sc.nextInt();
         int arearec=l*b;
     System.out.println(" area of rectangle:"+arearec);
    System.out.println(" ");
     }
     
 }       
class Triangle implements Area{
  public void printArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
  
        System.out.println("enter the breadth");
         int l=sc.nextInt();
         int b=sc.nextInt();
        double areatri= 0.5*l*b;
        System.out.println(" area of triangle:"+areatri);
        
    }
}
class Main{
    public static void main(String args[]){
        Rectangle obj=new Rectangle();
        obj.printArea();
        Triangle t =new Triangle();
        t.printArea();
    }
}  


#3. Define a class named Area which can be constructed by radius, length, and width.The Area
class have two methods : carea() to calculate area of circle and rarea() to calculate area of
rectangle
Sample Input & Output: Enter radius, length, and width - 4.5,12.2, 6.4
Area of circle with radius 4.50 is: 63.62
Area of rectangle with length 12.20 and width 6.40 is 78.08   
  


   import java.util.Scanner;
class Area{
        float r;
        float l;
        float b;
        Scanner sc = new Scanner(System.in);
        
     
      void carea(){
          System.out.println(" enter the radius");
          r=sc.nextFloat();
         float area =  r * r;
         System.out.println(" circle area :"+area);
      }
      void rarea(){
          System.out.println(" enter length");
          System.out.println(" enter breadth");
           l=sc.nextFloat();
           b=sc.nextFloat();
         float arearec = l * b;
          System.out.println(" rectangle area:"+arearec);
      }
}
class Main{
    public static void main(String args[]){
            Area obj=new Area();
            obj.carea();
            obj.rarea();
    }
    
} 
    
    

#4. (a)Write a Java program to create a class called Vehicle with a method called drive(). Create
a subclass called Car that overrides the drive() method to print "Repairing a car".
  

class Vehicle{
    void drive(){
        System.out.println(" car driving");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println(" Reparing a car");
    }
    
}
class Main{
    public static void main(String args[]){
        Car obj=new Car();
        obj.drive();
    }
}



(b) Write a Java program that takes three numbers from the user and prints the greatest
number.
 

    import java.util.Scanner;

class GreatestNumber{
    public static void main(String args []){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter three numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(" greater number is a");
        }
        else if(b>a && b>c){
            System.out.println(" greater number is b");  
        }
        else{
            System.out.println(" greater number is c");
        }
        
    }
}



#5. (a)Write a Java program to create a method that takes an integer as a parameter and throws
an exception if the number is odd.


  public class Exception_OddNumber {
  public static void main(String[] args) {
    int n = 18;
    trynumber(n);
    n = 7;
    trynumber(n);
  }

  public static void trynumber(int n) {
    try {
      checkEvenNumber(n);
      System.out.println(n + " is even.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public static void checkEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new IllegalArgumentException(number + " is odd.");
    }
  }
}



(b) Write a Java program that takes a number from the user and generates an integer
between 1 and 7. It displays the weekday name.


import java.util.Scanner;
class Weekdays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        
         if(n==1) 
         {
             System.out.println(" monday");
         }
        else if(n==2)
        {
        System.out.println("tuesday");
        }
        else if(n==3)
        {
        System.out.println("wednesday");
        }
        else if(n==4)
        {
        System.out.println("thursday");
        } 
        else if(n==5)
        {
        System.out.println("friday");
        }
        else if(n==6)
        {
        System.out.println("saturday");
        }
        else if(n==7)
        {
            System.out.println("sunday");
        }
        else
        {
            System.out.println(" invalid  day");
        }
}
}


#6. You are creating a student grading system. Each student has a name, student ID, and a list
of marks for different subjects. Implement a class in Java to represent a student and display
the student’s name who is having highest score.



import java.util.*;

public class Student {
    String name;
    String studentID;
    List<Integer> marks;

    public Student(String name, String studentID, List<Integer> marks) {
        this.name = name;
        this.studentID = studentID;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getHighestScore() {
        int highestScore = Integer.MIN_VALUE;
        for (int mark : marks) {
            highestScore = Math.max(highestScore, mark);
        }
        return highestScore;
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "S001", Arrays.asList(80, 90, 85)));
        students.add(new Student("Jane", "S002", Arrays.asList(75, 85, 95)));
        students.add(new Student("Alice", "S003", Arrays.asList(90, 95, 100)));

        Student studentWithHighestScore = null;
        int highestScore = Integer.MIN_VALUE;
        for (Student student : students) {
            int score = student.getHighestScore();
            if (score > highestScore) {
                highestScore = score;
                studentWithHighestScore = student;
            }
        }

        System.out.println("The student with the highest score is " + studentWithHighestScore.getName());
    }
}


#7. Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a
class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method
'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object
for each of the subclasses and call their respective methods.



package cse225i8;

abstract public class Animals {
 void cats() {
	 System.out.println("y");
 }
 void dogs() {
	 System.out.println("x");
 }
}
class Cats extends Animals{
	void cats() {
		System.out.println(" cats Meow");
	}
	
}
class Dogs extends Animals{
   void dogs() {
	   System.out.println("Dogs Bark");
   }
   
}
class Demo{
	public static void main(String args[]) {
	Animals d=new Dogs();
	Animals c=new Cats();
	d.dogs();
	c.cats();
	}
}



8. Write a Java program to check whether the given non-negative number is SPYNUMBER
or not. A SPYNUMBER is a number where the sum of its digits equals the product of its
digits. If the number is SPYNUMBER print true else print false.
Ex: 1124 is SPYNUMBER, because the sum of its digits(1+1+2+4) = 8 and the product of
its digits (1*1*2*4) = 8 is equal.



package internal1cse225i9;
import java.util.*;
public class SPYNUMBER {

	public static void main(String args[])
	{
		System.out.println("Enter a number to check for SPYNUMBER");
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int s=0,m=0;
		int p=1;
		while(n!=0)
		{
			m=n%10;
			s=s+m;
			p=p*m;
			n=n/10;
		}
		if(s==p)
		{
			System.out.println("TRUE");
			System.out.println("It is a SPYNUMBER");
		}
		else
		{
			System.out.println("FALSE");
			System.out.println("It is not a SPYNUMBER");
		}
			
	}

}


9. (a)Write a java program to check whether entered number is palindrome number or not.
Sample : input = 363, output = palindrome


import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}



(b) Write a Java program that accepts four integers from the user and prints equal if all four
are equal, and not equal otherwise.



import java.util.Scanner;
class Equalvalue{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
       if(n1==n2 && n2==n3 && n3==n4 && n4==n1) {
        System.out.println(" all numbers are equal");
     }
     else{
         System.out.println(" unequal");
     }
}
}


#10. (a)Given two strings s1 and s2, your task is to merge those strings to form a new merged
string
(b) Write a java program to check whether the given string is palindrome or not ?


package internal;
import java.util.*;
public class concatenation {
	public static void main(String args[])
	{
		System.out.println("Enter any two strings");
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		String s=s1.concat(s2);
		System.out.println("Concatenated String: "+s);
		
	}

}

(b) Write a java program to check whether the given string is palindrome or not ?


import java.util.Scanner;

class ChkPalindrome {
    public static void main(String args[]) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);
        if (str.equals(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}

