package easyProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Datastructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> a= new ArrayList<Integer>();
      HashSet<Integer> s = new HashSet<Integer>();
      HashMap<Integer,String> hm= new HashMap<Integer,String>();
      hm.put(1,"Word1");
      hm.put(2,"Word2");
      hm.put(3,"Word3");
      hm.put(4,"Word4");
      hm.put(5,"Word5");
      for(int i=0;i<10;i++) {
    	  a.add(i);
    	  s.add(i);
      }
      System.out.println(a);
      System.out.println(s);
      System.out.println(hm);
      Set<Entry<Integer, String>> i1=hm.entrySet();
      Iterator<Entry<Integer, String>> i2= i1.iterator();
      while(i2.hasNext()) {
    	 Map.Entry mp=(Map.Entry)i2.next();
    	 System.out.println(mp.getKey());
    	 System.out.println(mp.getValue());
      }
      
	}

}
