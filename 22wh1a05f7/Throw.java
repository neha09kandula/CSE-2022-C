package cse225f7;

public class Throw {
	static void checkAge(int age) {

		if (age < 18) {

		throw new ArithmeticException(" NO Access - You must be at least 18 years old.");

		}

		else {

		System.out.println("Access granted - You are old enough!");

		}

		}

		public static void main(String[] args) {

		checkAge(19); 

		}

     }
