package module3;

public class A3Primenumber {

	public static void main(String[] args) {
		// check given number is Prime or not
		int a = 15;
		int flag = 0;
		for(int i=2;i<a;i++)
		{
			if(a%1==0)
			{
				flag =1;
				break;
			}
		}
if(flag==0)
{
	System.out.println("prime");
}
else
{
	System.out.println("not prime");
}

	}

}
