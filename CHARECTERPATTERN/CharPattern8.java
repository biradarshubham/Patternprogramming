package Patternprograms;
/*

     a       
    b b b     
  c c c c c   
d d d d d d d 

 */
public class CharPattern8 {
	public static void main(String[] args) {
		int n=4;
		char c='a';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<n*2;j++)
			{	
				if(i+j>=n+1 && j-i<=n-1) 
			{
				System.out.print(c+" ");
			}
				else 
				{
				System.out.print("  ");
			}
				}
			System.out.println();
			c++;
			}
	}
}
