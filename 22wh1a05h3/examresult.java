package udemyexcercise;

public class examresult {
	    
	    public boolean isPass(int marks) {
	        
	        // Update Code : If the student's marks are greater than 50, they have passed the exam.
	    if(marks>50)
	    {
	        return true;
	    }
	    else{
	        return false;
	    }
	    }
	  public static void main(String[]args)
	  {
		  examresult resultChecker = new examresult();
		 System.out.println(resultChecker .isPass(51));
	  }
	  }
	


