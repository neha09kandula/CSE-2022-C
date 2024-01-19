package practice_problems;

public class Array_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=i;
		}
		int num=5;
		for(int i=0;i<5;i++) {
			b[i]=num;
			num++;
		}
		System.out.print("values of array A:");
		for(int i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("values of array B:");
		
		for(int i=0;i<5;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println();
		System.out.print("values of array C:");
		for(int i=0;i<5;i++) {
			System.out.print(c[i]+" ");
		}


	}
	

}
