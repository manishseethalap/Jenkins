package practice;

public class Dump {
	private Dump() {
		System.out.println("Private constructor running");
	}
	
	public static Dump m1() {
		Dump dump = new Dump();
		System.out.println(dump);
		return dump;
	}
	
	public void m2() {
		System.out.println("m2 running");
	}
	
}
