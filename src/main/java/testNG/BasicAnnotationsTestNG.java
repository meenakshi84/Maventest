package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotationsTestNG {

	@BeforeTest
	public void test1()
	{
		System.out.println("you are in the beforetest");
	}
	@BeforeClass
	public void test2()
	{
		System.out.println("you are in the beforeclass");
	}
	@BeforeMethod
	public void test3()
	{
		System.out.println("you are in the beforemethod");
	}
	@Test	
	public void test4()
	{
		System.out.println("you are in the 1st test method");
	}
	@Test	
	public void test5()
	{
		System.out.println("you are in the 2nd test method");
	}
	@AfterTest
	public void test6()
	{
		System.out.println("you are in the aftertest");
	}
	@AfterClass
	public void test7()
	{
		System.out.println("you are in the afterclass");
	}
	@AfterMethod
	public void test8()
	{
		System.out.println("you are in the aftermethod");
	}
}
