package module3;

public class A4Sumofarray {

	public static void main(String[] args) {
		// sum values of an array.
		int a[] = {45,75,15,83,7,10};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];          //sum+= a[i];
		}
		System.out.println("sum is:"+sum);
		

	}

}
