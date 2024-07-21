package Patternprograms;

/*
      A       
    A B C     
  A B C D E   
A B C D E F G 

 */
public class CharPattern11 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			char c='A';
			for(int j=1;j<n*2;j++)
			{
				if(i+j>=n+1 && j-i<=n-1)
				{
					System.out.print(c+" ");
					c++;
				}else 
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}
