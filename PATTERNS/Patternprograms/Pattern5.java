package Patternprograms;

/*
 
* * * * 
*   * * 
* *   * 
* * * * 
 
 */
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=num;j++) 
			{
				if(i+j==num+1 || j==1 || i==num || i==1 || j==num)
				{
						System.out.print("* ");
				}else {
					System.out.print("  ");
				}			
			}
			System.out.println();
		}
		
	}
}
