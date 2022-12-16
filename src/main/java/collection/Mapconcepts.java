package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Mapconcepts {

	public void mapimplementaionat()
	{
		//HashMap<Integer,String> HM = new HashMap<>();
		//LinkedHashMap<Integer,String> HM = new LinkedHashMap<>();
		TreeMap<Integer,String> HM = new TreeMap<>();
		HM.put(3, "sathish");
		HM.put(6, "kumar");
		HM.put(2, "R");
		HM.put(1, "sara");
		HM.put(1, "punith");
		HM.put(8, "Heera");
		HM.put(5, "Course");
		HM.remove(4);
		HM.remove(5, "sathish");
		HM.remove(5, "Course");
		
		System.out.println(HM);
		System.out.println(HM.isEmpty());
		System.out.println(HM.size());
		System.out.println(HM.get(2));
		System.out.println(HM.keySet());
		for(int eachvalue :HM.keySet())
		{
			System.out.println(HM.get(eachvalue));
		}
		
		System.out.println(HM.values());
		
		System.out.println(HM.entrySet());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapconcepts m = new Mapconcepts();
		m.mapimplementaionat();
	}

}
