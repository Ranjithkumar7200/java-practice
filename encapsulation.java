class Student
{
	private int rollno;
	private String name;
	
	// getters and setters
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
public class encapsulation 		// data had secured with private
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		
		s1.setRollno(2);
		s1.setName("Varun");
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}
}
