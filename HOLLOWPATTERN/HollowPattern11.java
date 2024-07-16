package Patternprograms;

/*
  
* * * * * * * * 
* * *     * * * 
* *         * * 
*             * 
*             * 
* *         * * 
* * *     * * * 
* * * * * * * * 
 
 */
public class HollowPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n*2;i++) 
		{
			for(int j=1;j<=n*2;j++)
			{
				if(i+j<=n+1||j-i>=n||i-j>=n||i+j>=n*3+1)
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

//i+j<=n+1||j-i>=n||i-j>=n||