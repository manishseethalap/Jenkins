package JavaDump;

public class pattern1 {
public static void main(String[] args) {
	int row=4,col=1,k=0,r=2,c=1,k2=0;
	for (int i=1;i<=row;i++) {
		for(int j=1;j<=col;j++) {
			k++;
			System.out.print(k+" ");
			if(j==3) {
				break;
			}
		}
		
		
	if(k==9) {
	for(int i1=1;i1<=r;i1++) {
		for(int j=1;j<=c;j++) {
			k2++;
			System.out.print(k2+" ");
		}
		c=c+4;
		System.out.println();
	}
	}
	System.out.println();
	col++;
	}
}
}

