package cse513;

public class Cse extends Thread {
   public static void main(String[] args) {
	   Cse Thread = new Cse();
	   System.out.println("thread is running inside");
   }
   public void run() {
	  System.out.println("thread is running outside");
}}
