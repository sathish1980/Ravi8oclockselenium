package OOPS;

public class Students {
	
	String institutename="ABCD";
	
	
	public void Studentsinfo(String name)
	{
		System.out.println("Hi Welcome to the course");
		System.out.println("You name is  : " +name );
	}
	
	public String courserequestedfor(String course)
	{
		return course;
	}
	public void courses()
	{
		
	}
	public void gendercount()
	{
		System.out.println("Male students are 12");
		System.out.println("Female students are 10");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s = new Students();
		s.Studentsinfo("Sathish");
		s.gendercount();
	}

}
