package Patternprograms;
/*

      * 
    * * 
  *   * 
*     * 
  *   * 
    * * 
      * 


 */
public class HollowPattern4 {
public static void main(String[] args) {
	int n=4;
	for(int i=1;i<n*2;i++) 
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j==n+1 || j==n || i-j==n-1)
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
