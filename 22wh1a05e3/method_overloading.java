package java_5e3;

public class method_overloading{
		public int sum(int x,int y) {
			return(x+y);
		}
		public int sum(int x,int y,int z) {
			return (x+y+z);
		}
		public double sum(double x,double y) {
			return(x+y);
		}
		
		public static void main(String[] args) {
			method_overloading s=new method_overloading ();
			System.out.println(s.sum(10,20));
			System.out.println(s.sum(10,20,30));
			System.out.println(s.sum(0, 0));
			}
}
