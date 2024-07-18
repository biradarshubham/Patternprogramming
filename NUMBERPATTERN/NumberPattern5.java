package Patternprograms;
/*

1 * 0 * 1 
1 * 0 * 1 
1 * 0 * 1 
1 * 0 * 1 
1 * 0 * 1 
 
 */
public class NumberPattern5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(j%2==0) 
				{
					System.out.print("* ");
				}
				else if(j==1 || j==n){//j==- o
					System.out.print("1 ");
				}
				else {
				System.out.print("0 ");
				}
			}
			System.out.println();
			}
	}
	}
