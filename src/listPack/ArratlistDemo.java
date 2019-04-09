package listPack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratlistDemo {

	public static void main(String[] args) {

		
		//data is stored in indexed manner
		//duplicacy/redundency is allowed
		
		ArrayList<String> list1 = new ArrayList<String>();//type specific
		ArrayList list2 = new ArrayList();//any type of data
		
		list1.add("vijaya");
		list1.add("ravi");
		list1.add("pinky");
		list1.add("ammulu");
		list1.add("vijaya");
		list1.add("vijaya");
		list1.add("vijaya");
		
		System.out.println("elements in list1==="+list1);
		int size=list1.size();
		System.out.println("no of elements in list1====="+size);
		System.out.println("********************************************************");
		
		list2.add("vijaya");
		list2.add("100");
		list2.add("200");
		list2.add("2.2");
		list2.add("true");
		list2.add("ravi");
		list2.add("kavya");
		list2.add("sai");
		list2.add("vijaya");
		list2.add("vijaya");
		
		System.out.println("elements in list2==="+list2);
		int size1=list2.size();
		System.out.println("no of elements in list2====="+size1);
		
		System.out.println("********************************************************");

		
/*		list1.add(5, "plano");

		System.out.println("elements in list1 afetr adding plano==="+list1);
		int sizeplano=list1.size();
		System.out.println("no of elements in list1  afetr adding plano====="+sizeplano);
		
		System.out.println("********************************************************");

		list1.addAll(list2);

		System.out.println("elements in list1 afetr adding list2==="+list1);
		int sizelist2=list1.size();
		System.out.println("no of elements in list1  afetr adding plano====="+sizelist2);
		
		System.out.println("********************************************************");

	String name=list1.get(2);
		System.out.println("element stored in list1 at no 3 position ======"+name);
		
		Object o =list2.get(3);
		System.out.println("element stored in list2 at no 4th position ======"+o);

		System.out.println("********************************************************");

		
		
		list1.set(5, "plano");
		System.out.println("elements stored in list1 after adding plano=== ======"+list1);

		
		System.out.println("********************************************************");

		
		if(list1.contains("plano")) {
			
System.out.println("plano is in the list");			
		}
		
		System.out.println("********************************************************");

		System.out.println(list1.size());
		for(String str : list1) {
			
			System.out.println(str);			

		}
				System.out.println("no of elements in list1 ======="+list1.size());

		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));			

		}
		
		
		System.out.println("********************************************************");
		System.out.println("no of elements in list2 ======="+list2.size());
for(Object o1 : list2) {
			
			System.out.println(o1);			
}
		

System.out.println("********************************************************");
System.out.println("********************* ITERATING WITH ITERATOR**********list1*******");
      Iterator<String> it= list1.iterator();
      String s = it.next();
      System.out.println(s);
      String s1 = it.next();
      System.out.println(s1); 
      String s2 = it.next();
      System.out.println(s2);
      String s3 = it.next();
      System.out.println(s3);
      String s4 = it.next();
      System.out.println(s4);
      String s5 = it.next();
      System.out.println(s5);



      System.out.println("********************************************************");
      System.out.println("********************* ITERATING WITH ITERATOR**********list2*******");
            Iterator it1= list2.iterator();
            Object o5 = it1.next();
            System.out.println(o5);
            Object o6 = it1.next();
            System.out.println(o6); 
            Object o7 = it1.next();
            System.out.println(o7);
            Object o8 = it1.next();
            System.out.println(o8);
            Object o9 = it1.next();
            System.out.println(o9);
            Object o10 = it1.next();
            System.out.println(o10);
*/
            
            System.out.println("********************************************************");
            System.out.println("**************while******* ITERATING WITH ITERATOR**********list2*******");
            Iterator it1= list2.iterator();

            while(it1.hasNext()) {
            	Object obj = it1.next();
            	System.out.println(obj);
            	
            	
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            



























		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}
