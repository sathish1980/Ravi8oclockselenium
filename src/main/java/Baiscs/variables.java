package Baiscs;

public class variables {
	
	int b=50;
	public void add()
	{
		int a=10;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void sub()
	{
		System.out.println(b);
		//System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variables obj = new variables();
		//System.out.println(obj);
		obj.add();
		obj.sub();
		//System.out.println(obj.b);
	}

}
