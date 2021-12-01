package org.practicecollection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Practice1 {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add("java");
		li.add(true);
		li.add(234567890l);
		li.add('M');
		li.add(4567.345678);
		li.add(10);
		li.add(null);
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		boolean contains = li.contains(10);
		System.out.println(contains);
		
		Object object = li.get(3);
		System.out.println(object);
		
		li.add(3,false);
		System.out.println(li);
		
		li.set(2, 1111);
		System.out.println(li);
		
		li.remove(5);
		System.out.println(li);
		
		List mi=new ArrayList();
		mi.add(1000);
		mi.add("Greens");
		mi.add(false);
		
		List ni=new ArrayList();
		ni.add("Greens");
		ni.add(4444);
		ni.add(true);
		
		mi.removeAll(ni);
		System.out.println(mi);
		System.out.println(ni);
		
		mi.retainAll(ni);
		System.out.println(ni);
		
		List x=new LinkedList();
		System.out.println(x);
		
		x.addAll(li);
		for (int i = 0; i <li.size(); i++) {
			Object object2 = li.get(i);
			System.out.println(object2);
		}
		
		for (Object y : li) {
			System.out.println(y);
			
		}
		System.out.println("this is Dev");
		
		
		
	}

}
