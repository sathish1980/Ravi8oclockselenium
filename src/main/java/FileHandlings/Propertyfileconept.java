package FileHandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfileconept {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\Ravi80clockonlineJavaSelenium\\input\\environment.properties";
	
	public void openpropertyfile() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FI = new FileInputStream(F);
		Properties p= new Properties();
		p.load(FI);
		String username=p.getProperty("user");
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("edu"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("usernames"));
		p.setProperty("Batch", "2022");
		System.out.println(p.getProperty("Batch"));
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Propertyfileconept p = new Propertyfileconept();
		p.openpropertyfile();
	}

}
