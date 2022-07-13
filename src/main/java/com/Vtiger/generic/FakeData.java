package com.Vtiger.generic;

import com.github.javafaker.Faker;


/**
 * 
 * @author manish
 * @description : This class is used to fake data for Test Execution 
 */
public class FakeData {
	Faker faker = new Faker();
	
	
	/**
	 * @author manish
	 * @return This method returns the fake firstName for Test Execution
	 */
	public String firstName () {
		return faker.name().firstName();
	}
	
	
	/**
	 * @author manish
	 * @return This method returns the fake lastName for Test Execution
	 */
	public String lastName() {	
		return faker.name().lastName();
	}
	
	
	/**
	 * @author manish
	 * @return This method returns the fake organization name for Test Execution 
	 */
	public String orgName() {
		return faker.company().name();
	}
	
	/**
	 * @author manish
	 * @return This method returns the fake campaign name for Test Execution
	 */
	public String campName() {
		return faker.company().name();
	}
}
