package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setconept {
	
	public void setimplementation()
	{
		//HashSet<String> Hs = new HashSet<>();
		//LinkedHashSet<String> Hs = new LinkedHashSet<>();
		TreeSet<String> Hs = new TreeSet<>();
		Object Hs1 = new HashSet<>();
		Hs.add("Sathish");
		Hs.add("kumar");
		Hs.add("R");
		Hs.add("Sathish");
		Hs.add("B.Tech");
		Hs.remove("R");
		
		for (String eachvalue: Hs)
		{
			System.out.println(eachvalue);
		}
		Iterator it= Hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(Hs.size());

		Hs1=Hs.clone();
		System.out.println(Hs.isEmpty());
		Hs.clear();
		System.out.println(Hs.isEmpty());
		
		System.out.println(Hs1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Setconept s = new Setconept();
		s.setimplementation();
	}

}
