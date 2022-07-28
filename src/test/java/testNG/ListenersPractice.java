package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ListenersPractice {
@BeforeSuite
public void browserOpen() {
	System.out.println("Browser opened!");
}
@BeforeTest
public void url() {
	System.out.println("URL entered!");
}
@BeforeClass
public void login() {
	System.out.println("Login done!");
}
@BeforeMethod
public void testStatus() {
	System.out.println("Test Started!");
}
@Test
public void test1() {
	System.out.println("Test 1 running!");
}
public void test2() {
	System.out.println("Test 2 running!");
}
public void test3() {
	System.out.println("Test 3 running!");
}
@AfterMethod
public void afterStatus() {
	System.out.println("Test runned!");
}
@AfterClass
public void logout() {
	System.out.println("Logged out!");
}

}
