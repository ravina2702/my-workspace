package module4;

import org.testng.annotations.Test;

public class T5Group {
	//cart
	@Test(groups = "smoke")
	public void edititem()
	{
		System.out.println("edit item run");
	}
@Test(groups = "sanity")
public void removeitem()
{
	System.out.println("remove item run");
}

//payment
@Test(groups = {"smoke","sanity"})
public void creditcard()
{
	System.out.println("run creditcard");
}
@Test
public void debitcard()
{
	System.out.println("debitcard run");
}
@Test(groups = "sanity")
public void cod()
{
	System.out.println("run cod");
}

}

	
	


