package module3;

import java.util.ArrayList;

public class A16Copyarray {

	public static void main(String[] args) {
		// Copy one array into another
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("orange");
		a1.add("red");
		a1.add("yellow");
		a1.add("green");
		
		ArrayList<String>	a2 = new ArrayList<String>();	
        a2.add("pineaple");
        a2.add("apple");
        a2.add("mango");
        a2.add("kiwi");
        a2.addAll(a1);
        
        for(String s:a2)
        {
        	System.out.println(s);
        }
        
		

	}

}
