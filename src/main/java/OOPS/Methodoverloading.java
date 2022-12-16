package OOPS;

public class Methodoverloading {
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println("the sum of two number is: "+c);
	}
	
	public void add(double a, int b)
	{
		double c= a+b;
		System.out.println("the sum of two number is: "+c);
	}
	
	public void add(int a, int b,int d)
	{
		int c= a+b+d;
		System.out.println("the sum of three number is: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading M = new Methodoverloading();
		M.add(2.4, 3);
	}

}
