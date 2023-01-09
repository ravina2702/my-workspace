package module3;

public class A9Trycatch {

	public static void main(String[] args) {
		//  demonstrate try catch block.
		
		try {
			Class.forName("javademo1.java");
		} catch (ClassNotFoundException e) {
			// TODO: handle except
			e.printStackTrace();
		}		


	}

}
