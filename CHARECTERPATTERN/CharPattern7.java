package Patternprograms;
/*
  
      a 
    b c 
  c d e 
d e f g 
 
 */
public class CharPattern7 {
	public static void main(String[] args) {
		
		int n=4;
		char c='a';
		for(int i=1;i<=n;i++)
		{
			char ch=c;
			for(int j=1;j<=n;j++)
			{
				if(i+j>=n+1) 
				{
					System.out.print(ch+" ");
					ch++;
				}else 
				{
					System.out.print("  ");
				}
				
			}
			c++;
		System.out.println();
		}
}
}