package Patternprograms;

/*
* * * * * * * 
* * *   * * * 
* *       * * 
*           * 

 */
public class Pattern14 {

	public static void main(String[] args) {
		
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n*2-1;j++) //n*2
			{
				if(i+j<=n+1 || j>=i+n-1)//j-i>=n-1
				{
					System.out.print("* ");
				}else 
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}
