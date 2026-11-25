package Junitfirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit_firstpgm {

	@Before
	public void setup()
	{
		System.out.println("browser open");

	}
	
	@Test
	public void test()
	{
		System.out.println("test activity");
		
	}
	@After
	public void after()
	{
		System.out.println("browser close");
	}
}
