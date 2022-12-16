package Baiscs;

public class Firstclass {
	
	protected int age=19; //#global vairable
	public static int age1=21;
	
	//accesmodifier datatype variablename = value;
	
	//#datatypes
	//int - wholenumber 
	int a =1234567890;
	//float
	float c=1.2f;
	//decimal
	double b =2.3223;
	//char
	char d='a';
	//word
	String e="name";
	//true or fale
	boolean present=true;
	int[] curage= {1,2,4,6,7};
	
	
	public Firstclass()
	{
		System.out.println(" This is constuctor"+age +age1);
	}
	public Firstclass(int a, int b)
	{
		int c=a/b; //#local variable
		System.out.println(" This is constuctor: "+c);
	}
	//accessmodifier returntype methodname()
	public void add() //method implementation
	{
		int age=40;
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of 2 number"+a +age);
	}
	
	
	
	//four types
	// method with out parameter /arguments
	// method with parameter / arguments
	// method with out return type
	// method with return type
	
	// method with out parameter /arguments
	public void addition() //method implementation
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of 2 number"+c);
	}
	
	// method with parameter / arguments
		public void subtraction(int a, int b) //method implementation
		{
			int c=a-b;
			System.out.println("subtaract of 2 number"+c);
		}
		
	// method with out return type and with parameter
		public void multiplication(int a, int b) //method implementation
		{
			int c=a*b;
			double e=division(a, b);
			double f= c-e;
			System.out.println("multiplication of 2 number"+c);
			System.out.println("after division subtraction of 2 number"+f);
		}
		
	// method return type and with parameter
		public double division(int a, int b) //method implementation
		{
			double c=a/b;
			System.out.println("divide of 2 number"+c);
			return c;
		}
		
	
	public static void main(String[] a) 
	{
		System.out.println("sathish kumar");
		System.out.println("r");
		System.out.println("kumar");
		System.out.println("R");
		System.out.println("B.tech");
		System.out.print("sathish kumar");
		System.out.println("B.tech");
		Firstclass first = new Firstclass(); // instanstaiation
		Firstclass first1 = new Firstclass(4,5);
		first.add();// Method call
		first.subtraction(10,5);
		first.multiplication(4, 2);
		//first.Firstclass();
		
	}
	

}

