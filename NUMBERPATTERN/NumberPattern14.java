package Patternprograms;
/*

      1 
    1 0 
  1 0 1 
1 0 1 0 
 
 */
public class NumberPattern14 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{ 
			int k=1;
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1) 
				{
					System.out.print(k+" ");
					if(k==1) 
					{
						k--;
					}
				else 
				{
					k++;
				}
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}
}
