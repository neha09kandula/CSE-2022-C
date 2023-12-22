package Frame;

public class Ayesha {
public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	  int a[]= {1,2,3,4};
	  System.out.println(a[30]);
  }
  catch(ArrayIndexOutOfBoundsException abe) {
	  System.out.println(abe);
  }
  finally {
	  System.out.println("The rest of the code always execute");
  }
	}

}
