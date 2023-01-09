package module3;

public class A6Minmaxnumberofarray {

	public static void main(String[] args) {
		// the maximum and minimum value of an array
		int a[] = {45,75,15,83,7,10};
		int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("max is:"+ max);
		System.out.println("min is:"+ min);

	}

}
