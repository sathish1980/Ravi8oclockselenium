package FileHandlings;

public class Stringhandlings {
	
	String name="Sathish kumar R";
	String name1="sathish kumar R";
	String filename="sathish.xml";
	String course="";
	String fees=null;
	String country=" INDIA is my country ";
	
	public void stringimplementation()
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name==name1);
		System.out.println(name.concat(name1));
		System.out.println(name+name1);
		System.out.println(name.contains("kumsar"));
		System.out.println(name.startsWith("Sath"));
		System.out.println(name.endsWith(" R"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,7));
		System.out.println(course.isEmpty());
		System.out.println(fees);
		System.out.println(name.replace("Sathish", "THI"));
		/*String[] newval=name.split("a");
		for(String newvalue:newval)
		System.out.println(newvalue);*/
		//String[] newval=name.split("\s");
		//for(String newvalue:newval)
		//System.out.println(newvalue);
		char[] eachout= {'s','a','t'};
		char[] eachchat=name.toCharArray();
		for (char val:eachchat) {
			System.out.println(val);
		}
		System.out.println(country.trim());
		System.out.println(country.replace(" ",""));
		int age=30;
		int age2=40;
		String newage=String.valueOf(age);
		System.out.println(newage+age2);
		
	}
	
	public void fileidentify()
	{
		int totallenght=filename.length();
		int positionvalue=filename.indexOf(".");
		String fileextendsion=filename.substring(positionvalue);
		System.out.println(fileextendsion);
		if(fileextendsion.equalsIgnoreCase(".txt"))
		{
			System.out.println("This is txt file");
		}
		else if(fileextendsion.equalsIgnoreCase(".xlsx"))
		{
			System.out.println("This is excel file");
		}
		else if(fileextendsion.equalsIgnoreCase(".xml"))
		{
			System.out.println("This is xml file");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringhandlings s = new Stringhandlings();
		s.stringimplementation();
		//s.fileidentify();
	}

}
