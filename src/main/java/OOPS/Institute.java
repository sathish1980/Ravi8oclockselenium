package OOPS;

public class Institute extends Students {
	
	
	int startedyear=2000;
	int startedmonth=03;
	String[] course= {"python","c#","java","SQL","Manual"};
	public void instituteinfo()
	{
		System.out.println("Institute stated on :" +startedyear);
		System.out.println("Institute stated month :" +startedmonth);
		System.out.println("Institute Name: "+institutename);
	}
	
	public void courses()
	{
		for(int i=0;i<course.length;i++)
		{
			System.out.println(course[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Institute I = new Institute();
		I.instituteinfo();
		I.courses();
		I.Studentsinfo("Sathish");
		I.gendercount();
	}

}
