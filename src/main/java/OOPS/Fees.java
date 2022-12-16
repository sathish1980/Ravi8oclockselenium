package OOPS;

public class Fees extends Institute {
	
	int javacourse=20000;
	int pythoncourse=30000;
	int sqlcourse=15000;
	int manualcourse=10000;
	
	public void coursefees(String coursename)
	{
		if (coursename=="Java")
		{
		System.out.println("Your java course fees is : "+javacourse);
		}
		else if(coursename=="Python")
		{
		System.out.println("Your python course fees is : "+pythoncourse);
		}
		else if(coursename=="Sql")
		{
		System.out.println("Your sql course fees is : "+sqlcourse);
		}
		else if (coursename=="Manual")
		{
		System.out.println("Your manual course fees is : "+manualcourse);
		}
		else
		{
			System.out.println("This is invalid course");
		}
	}
	
	public void discount(Boolean Avaialble ,int dobyear)
	{
		if (Avaialble == true)
		{
			System.out.println("You are eligible for discount");
			int discountpercentage =discountpercentage(dobyear);
			System.out.println("You are eligible for "+discountpercentage+" % discount");
		}
		else
		{
			System.out.println("You are not eligible for discount");
		}
	}
	
	public int discountpercentage(int year)
	{
		int discountpercentage=0;
		if (year>2010)
		{
			discountpercentage=10;
		}
		else
		{
			discountpercentage=15;
		}
		return discountpercentage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fees F = new Fees();
		F.instituteinfo();
		F.courses();
		F.Studentsinfo("ABCD");
		F.gendercount();
		F.coursefees(F.courserequestedfor("Manual"));
		//F.coursefees("Java");
		F.discount(true, 2015);
	}

}
