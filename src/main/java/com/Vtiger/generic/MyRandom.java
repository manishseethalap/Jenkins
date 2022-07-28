package com.Vtiger.generic;

import java.util.Random;



/**
 * @author manish
 * @description This class is used to create random data for test execution in numbers
 */
public class MyRandom{
	static Random random = new Random();

	/**
	 * @author manish	
	 * @return This method returns random number in long for test execution
	 */

//	public long randomLongNumber() {
//	//	return random.nextLong(999999999999999999l);
//	}
/**
 * @author manish	
 * @return This method returns random number for test execution
 */
public static int randomNumber() {
	int r=random.nextInt(9999);
	return r;
}

/**
 * @author manish	
 * @return This method returns random number in double for test execution
// */
//public double randomDoubleNumber() {
//	return random.nextDouble(9999999999999.99999);
//}

/**
 * @author manish	
 * @return This method returns random number in float for test execution
 */

//public float randomFloatNumber() {
//	return random.nextFloat(999999999.99999999f);
//}

}
