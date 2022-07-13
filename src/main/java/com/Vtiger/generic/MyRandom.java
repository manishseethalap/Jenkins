package com.Vtiger.generic;

import java.util.Random;



/**
 * @author manish
 * @description This class is used to create random data for test execution in numbers
 */
public class MyRandom{
	Random random = new Random();

	/**
	 * @author manish	
	 * @return This method returns random number in long for test execution
	 */

	public long randomLongNumber() {
		return random.nextLong();
	}
/**
 * @author manish	
 * @return This method returns random number for test execution
 */
public int randomNumber() {
	return random.nextInt();
}

/**
 * @author manish	
 * @return This method returns random number in double for test execution
 */
public double randomDoubleNumber() {
	return random.nextDouble();
}

/**
 * @author manish	
 * @return This method returns random number in float for test execution
 */

public float randomFloatNumber() {
	return random.nextFloat();
}

}
