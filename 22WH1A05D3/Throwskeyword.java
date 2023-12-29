package cse225d3;

import java.io.IOException;
public class Throwskeyword {
		void m() throws IOException
		{
			throw new IOException("Device Error");
		}
		void n() throws IOException
		{
			m();
		}
		void p()
		{
			 try
			 {
				 n();
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception Handled");
			 }
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Throwskeyword obj= new Throwskeyword();
			obj.p();
			System.out.println("Normal Flow");
		}

	}

