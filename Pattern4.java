package Patternprograms;

/*
 
* * * * 
* *   * 
*   * * 
* * * * 
 
 */
public class Pattern4 {
	public static void main(String[] args) {
		int a=4;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++) 
			{
				if(i==1 || i==a || j==1 || j==a ||i==j)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}
}}
