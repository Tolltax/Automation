package SharafDG_BrandPanel;

import java.util.ArrayList;

public class Array1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Sonu");
		list.add("Kumar");
		int size =list.size();
		boolean a = list.isEmpty();
		//list.clear();'
		
		//list.trimToSize();
		
		
			
		list.add(1, "dk");
		System.out.println(list);
		System.out.println(size);
		System.out.println(a);
		
		
	}

}
