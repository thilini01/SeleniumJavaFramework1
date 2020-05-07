package TestNG_Listners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG_Listners.TestNGLitners.class)

public class TestNG_Listner_Demo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test one");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test two");
	}

	@Test
	public void test3() {
		System.out.println("I am inside test three");
		throw new SkipException("This test is skipped");
	}



}
