package DreamJava;

import java.util.HashMap;
import java.util.Map;

public class CollectionFramework8 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> c = new HashMap<>();
		c.put(1, "Pratik");
		c.put(2, "Prashant");
		c.put(3, "Sutar");
		System.out.println(c);
		
		c.put(3,"tanu");
		System.out.println(c);
		
		c.putIfAbsent(3,"chinu");
		System.out.println(c);
		c.remove(c);
		System.out.println(c);
		
		for (Integer d:c.keySet()) 
		{
			System.out.println(d);
		}
		for (String d:c.values()) 
		{
			System.out.println(d);
		}

	}

}
