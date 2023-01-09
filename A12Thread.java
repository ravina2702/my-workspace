package module3;

class Sample
{
	
}
class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{

			try {
				sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Th1 :"+i);
		//	System.out.println(currentThread().getName()+" : "+i);
	}
}
}
class Th2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println("th2 :"+i);
		}
	}
}
			
		public class A12Thread {

	public static void main(String[] args) {
		// one thread by extending Thread class in another class
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();

		t1.setName("subject");
		t2.setName("color");

		System.out.println(t1.getName()+" "+t2.getName());
		System.out.println(t1.getId()+" "+t2.getId());
		System.out.println(t1.getPriority()+" "+t2.getPriority());

		t1.start();
		t2.start();
	}
	}
	


