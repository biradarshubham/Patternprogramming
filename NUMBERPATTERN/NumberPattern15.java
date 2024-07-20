package Patternprograms;
/*
 
1 0 1 0 
1 0 1   
0 1     
0       
 
 */
public class NumberPattern15 {
	public static void main(String[] args) {
		int n=4;
		int k=1;
		for(int i=1;i<=n;i++) 
		{ 
			for(int j=1;j<=n;j++)
			{
				if(i+j<=n+1) 
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
