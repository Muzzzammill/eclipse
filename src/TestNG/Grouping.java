package TestNG;

import org.testng.annotations.Test;

public class Grouping {

	
	@Test (groups = ("santy"))
	public void main1()
	{
		System.out.println("this is main one");
	}
	
	@Test(groups={"sanity","smoke"})
	public void main2()
	{
		System.out.println("this is main2");
	}
	@Test(groups= {"regression"})
	public void main3() {
		
		System.out.println("this is main3");
	}
	@Test(groups= {"sanity", "regression"})
	public void main4 ()
	{ 
		System.out.println("t");
	} 
	}

