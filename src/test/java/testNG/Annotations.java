package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
@BeforeSuite
public void beforeSuit() {
	System.out.println("Before Suit");
}
@AfterSuite
public void afterSuit() {
	System.out.println("After suit");
}
@BeforeTest
public void beforeTest() {
	System.out.println("Before test");
}
@AfterTest
public void AfterTest() {
	System.out.println("After test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before class");
}
@AfterClass
public void afterClass() {
	System.out.println("after class");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("after method");
}
}
