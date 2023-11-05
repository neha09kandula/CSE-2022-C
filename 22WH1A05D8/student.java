public class Student
{
    String name;
    int yob;
    public int check(){
        return yob;
    }
	public static void main(String[] args) { 
	    Student s1= new Student();
		System.out.println(s1.yob);
		s1.name="Fouziya";
		s1.yob=2006;
		System.out.println(s1.yob+" "+s1.name);
		System.out.println(s1.check());
		Student s2= new Student();
		//System.out.println(s2.yob);
		s2.name="Meraj";
		s2.yob=2008;
		System.out.println(s2.yob+" "+s2.name);
		System.out.println(s2.check());
	}
}
