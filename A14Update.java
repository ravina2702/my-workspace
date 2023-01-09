package module3;

import java.util.ArrayList;

public class A14Update {

	public static void main(String[] args) {
		// update specific array element by given element
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("selenium");
		al.add(3, "android");
		al.set(2, "flatter");
		for(String s:al)
		{
			System.out.println(s);
		}

	}

}
