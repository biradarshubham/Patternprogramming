package Patternprograms;
/*
 
      d 
    c d 
  b c d 
a b c d 
  b c d 
    c d 
      d 

 */
public class CharPattern13 {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<n*2;i++) 
		{
			char c='a';
			for(int j=1;j<=n;j++) 
			{
				if(i+j>=n+1  && i-j<=n-1) 
				{                                                                                                                   
					System.out.print(c+" ");
					
				}
				else 
				{
					System.out.print("  ");
				}
				c++;
			}
		System.out.println();
		}
	}
}
