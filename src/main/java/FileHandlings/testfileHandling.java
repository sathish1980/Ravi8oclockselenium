package FileHandlings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testfileHandling {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Ravi80clockonlineJavaSelenium\\input\\input.txt";
	String fileoutpath="C:\\Users\\sathishkumar\\eclipse-workspace\\Ravi80clockonlineJavaSelenium\\input\\output.txt";
	public void textreaddata() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileInputStream FI=new FileInputStream(F);
		int i;
		while((i=FI.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(100);
		}
		
	}
	
	public void textreaddatafilereader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI=new FileReader(F);
		int i;
		while((i=FI.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(100);
		}
		
	}
	
	public void textreaddatalinebyline() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI=new FileReader(F);
		BufferedReader Bf = new BufferedReader(FI);
		String i;
		while((i=Bf.readLine())!=null)
		{
			System.out.println(i);
			Thread.sleep(100);
		}
		
	}
	
	public void writedata() throws IOException
	{
		File F = new File(fileoutpath);
		FileOutputStream FI=new FileOutputStream(F);
		String writedate="Besant technologies weekend batch";
		FI.write(writedate.getBytes());
		System.out.println("done");
		FI.close();
	}

	public void writedatafilewriter() throws IOException
	{
		File F = new File(fileoutpath);
		FileWriter FI=new FileWriter(F);
		String writedate="Besant technologies weekend batch";
		FI.write(writedate);
		System.out.println("done");
		FI.close();
	}
	
	public void readandwrite() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FI=new FileReader(F);
		File FW = new File(fileoutpath);
		FileWriter FWR=new FileWriter(FW);
		BufferedReader Bf = new BufferedReader(FI);
		String i;
		while((i=Bf.readLine())!=null)
		{
			if(i.contains("chennai"))
			{
			FWR.write(i);
			FWR.write("\n");
			}
			System.out.println(i);
		}
		FWR.close();
		FI.close();
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		testfileHandling t = new testfileHandling();
		t.readandwrite();
	}

}
