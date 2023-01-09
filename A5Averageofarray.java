package module3;

public class A5Averageofarray {

	public static void main(String[] args) {
		// the average value of array elements.
		int a[] = {45,75,15,83,7,10};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];          //sum+= a[i];
		}
		System.out.println("sum is:"+sum);
		System.out.println("avg is:"+(sum/a.length));

	}

}
