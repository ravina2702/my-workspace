package module3;

import java.util.ArrayList;

public class A13Removearray {

	public static void main(String[] args) {
		// remove the third element from a array list.
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("selenium");
		al.add(3, "android");
		
		al.remove(3);
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
