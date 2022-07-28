package TestNG_Dump;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priorities_and_Dependencies {
	@Test(dependsOnMethods ="ticketBooked")
	public void buyTicket() {
		System.out.println("Ticket bought!");
	}
	@Test(dependsOnMethods ="findAudit")
	public void auditEnter() {
		System.out.println("Entered auditorium!");
	}

	@Test(dependsOnMethods = "findSeat")
	public void watchMovie() {
		System.out.println("Watching movie!");
	}
	@Test(priority = 1)
	public void ticketBooked() {

		System.out.println("Ticket successfully booked!");
	}
	@Test(priority = 2)
	public void findAudit() {
		System.out.println("Audit found!");
		Assert.assertFalse(true);
	}
	@Test(priority = 3)
	public void findSeat() {
		System.out.println("Seated!");
	}
}
