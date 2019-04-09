package setPack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//data is not added in indexed approch
		//hashing is used
		//output is unoreded in hashset in output due to hashing
		
		System.out.println("*********************************************************");
		HashSet<String> set = new HashSet<String>();
		set.add("vijaya");
		set.add("ravi");
		set.add("vijaya");
		set.add("kavya");
		set.add("vijaya");
		set.add("sai");
		set.add("vijaya");
		set.add("vijaya");
		System.out.println(set.hashCode());
		
		int sise= set.size();
		System.out.println("size of set==========="+sise);
		System.out.println("elements present in hash set ========"+set);
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
		
		
		System.out.println("**********************DATA IS ALPHABETICALLY ORDERED*************TREESET**********************");
		TreeSet<String> settree = new TreeSet<String>();
		settree.add("vijaya");
		settree.add("ravi");
		settree.add("vijaya");
		settree.add("kavya");
		settree.add("vijaya");
		settree.add("sai");
		settree.add("vijaya");
		settree.add("vijaya");	
		System.out.println(settree.hashCode());

		int size= settree.size();
		System.out.println("size of set==========="+size);
		System.out.println("elements present in tree set ========"+settree);
		
	}

}
