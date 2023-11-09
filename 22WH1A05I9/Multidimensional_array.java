package javaprograms;

public class Multidimensional_array {
	public static void main(String args[])
	{
		int nums[][]=new int[3][4];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				nums[i][j]=(int)(Math.random()*100);
				
			}
		}
		for(int n[]:nums)
		{
			for(int m:n) {
				System.out.println();
				
			}
		}
	System.out.println(" ");
	}
}

