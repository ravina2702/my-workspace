package module3;

import java.util.ArrayList;

public class A15Iterateonearray {

	public static void main(String[] args) {
		// iterate through all elements in an array list
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("selenium");
		al.add(3, "android");
		for(String s:al)
		{
			System.out.println(s);
		}
		

	}

}
