package Patternprograms;

/*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 

 */
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) //j==n,i==n,i+j==n+1
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1) 
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
