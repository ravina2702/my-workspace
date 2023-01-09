package module3;

import java.util.Scanner;

public class A17Grades {

	public static void main(String[] args) {
		// grades
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter mark");
		int mark = sc.nextInt();
		if(mark>=91 && mark<=100)
		{
			System.out.println("grade AA");
		}
		else if(mark>=81 && mark<=90)
		{
			System.out.println("grade AB");
		}
		else if(mark>=71 && mark<=80)
		{
			System.out.println("grade BB");
		}
		else if(mark>=61 && mark<=70)
		{
			System.out.println("grade BC");
		}
		else if(mark>=51 && mark<=60)
		{
			System.out.println("grade CD");
		}
			else if(mark<=50 && mark>=41)
		{
			System.out.println("grade DD");
		}
			else if(mark<=40 && mark>0)
			{
				System.out.println("Fail");
			}
			
		
		else
		{
			System.out.println("invalid");
		}

	}

}
