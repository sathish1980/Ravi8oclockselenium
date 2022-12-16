package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class listconcepts {
	
	int[] age= {2,3,56,78,2};
	//String[] al = {"sathish","kumar","R","sathish"}
	
	public void arraylist()
	{
		//ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> al = new LinkedList<String>();
		al.add("sathish");
		al.add("kumar");
		al.add("R");
		al.add("sathish");
		al.add("B.Tech");
		al.remove(4);
		al.set(2, "Information Technology");
		al.add(2, "newval");
		
		for (String eachvalue:al)
		{
			System.out.println(eachvalue);
		}
		
		Iterator it= al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(al.size());
		al.clear();
		for (String eachvalue:al)
		{
			System.out.println(eachvalue);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listconcepts l = new listconcepts();
		l.arraylist();
	}

}
