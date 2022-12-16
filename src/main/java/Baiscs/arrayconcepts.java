package Baiscs;

public class arrayconcepts {
	
	int age1=20; //variable
	int[] age= {25,34,67,43,12}; //array
	
	public void arrayimplmentation()
	{
		System.out.println(age1);
		System.out.println(age[2]);
		for(int newvar:age)
		{
			System.out.println(newvar);
			if (newvar==67)
			{
				System.out.println("67 is availabe");
			}
		}
		System.out.println("aray length: " +age.length);
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
	}
	
	
	public static void main(String[] args)
	{
		arrayconcepts a = new arrayconcepts();
		a.arrayimplmentation();
	}

}
