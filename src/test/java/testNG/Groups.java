package testNG;

import org.testng.annotations.Test;

public class Groups extends Annotations{
@Test(groups = "regression")
public void groupTest1() {
	System.out.println("Group test 1 running");
}
@Test(groups = {"regression","smoke"})
public void groupTest2() {
	System.out.println("Group test 2 running");
}
}
