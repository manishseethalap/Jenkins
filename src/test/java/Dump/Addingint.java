package Dump;

public class Addingint {
public static void main(String[] args) {
	int a = 1111,r=0, sum=0;
	while(a!=0) {
		r = a%10;
		a =a/10;
		sum = sum+r;
	}
	System.out.println(sum);
}
}
