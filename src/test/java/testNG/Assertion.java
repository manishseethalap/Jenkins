package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
@Test
public void m1() {
	SoftAssert sa = new SoftAssert();
	String actualR="Get title";
	String expectedR= "Get title";
	
	String actualURL = "Google";
	String expecetedURL = "Google";
	sa.assertEquals(actualURL, expecetedURL);//soft assert
	System.out.println("Hello");
	sa.assertAll();
	Assert.assertEquals(actualR, expectedR); //hard assert
	System.out.println("hi");
	
}
}
