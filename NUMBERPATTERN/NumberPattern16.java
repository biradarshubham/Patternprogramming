package Patternprograms;
/*
 
      1       
    2 * 2     
  3 * 3 * 3   
4 * 4 * 4 * 4 

 */
public class NumberPattern16 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<n*2;j++)
			{
				if(i+j>=n+1&&j-i<=n-1) 
				{	if((i+j)%2==0) {
					System.out.print("* ");	
				}else {
					System.out.print(i+" ");
				}
				}else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}
}
