package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	@Parameters("ANIMAL")
@Test
public void paramTest1(String animal) {
	System.out.println("Parameter Test1");
	System.out.println(animal);
}
@Test
public void paramTest2() {
	System.out.println("Parameter Test2");
}
}
