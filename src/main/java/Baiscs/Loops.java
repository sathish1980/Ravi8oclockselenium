package Baiscs;

import java.io.FileNotFoundException;
import java.io.IOException;

public final class Loops {
	
	  final int a=20;
	  int z1=20;
	
	public final void forloop(int a)
	{
		int nexttenvalue=a+10;
		for(int i=a;i<=nexttenvalue;i++)
		{
			System.out.println(i);
		}
	}
	
	public void whileloop(int a)
	{
		int nexttenvalue=a+11;
		while(a<=nexttenvalue)
		{
			System.out.println(a);
			a=a+1;
		}
	}
	
	public void whileloopnotsatisfied(int a)
	{
		int nexttenvalue=100;
		while(a<=nexttenvalue)
		{
			System.out.println(a);
		}
	}
	
	public void dowhileloopnotsatisfied(int a)
	{
		int nexttenvalue=100;
		do
		{
			System.out.println(a);
		}
		while(a<=nexttenvalue);
	}
	
	public void div(int a, int b) throws Throwable
	{
		try
		{
			if(b>0)
			{
			double c=a/b;
			System.out.println(c);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("this is invalid data , please check the number");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Hey u are getting an exception");
			System.out.println(e);
		}
		finally
		{
			System.out.println("this finally");
			finalize();
		}
	}
	
	public void age(int currentage)
	{
		if (currentage <18)
		{
			throw new ArithmeticException("You are not a major");
		}
		//a=a+10;
		System.out.println(a);
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Loops L= new Loops();
		L.div(10, 0);
		L.dowhileloopnotsatisfied(1000);
		L.age(15);
	}

}
