package Patternprograms;

public class NumberPattern9 {

	public static void main(String[] args) {
		int n=5 ;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1) {
					System.out.print("1 ");
				}else if(j==3) {
					System.out.print("2 ");
				}else if(j==5) {
					System.out.print("3 ");
				}else {
					System.out.print("* ");
				}
			}
		System.out.println();
		}

	}

}
