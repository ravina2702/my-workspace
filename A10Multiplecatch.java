package module3;

public class A10Multiplecatch {

	public static void main(String[] args) {
		// demonstrate multiple catch blocks
		
		System.out.println("program started");
		try {
			int i =10;
			int j = i/0;
			System.out.println(j);
			
			int a[] = new int[10];
			a[11]=50;
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("you have an error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("program ended");

	}

}
