package Patternprograms;
/*
 
A A A A 
B B B  
C C   
D    

 */
public class CharPattern4 {
	public static void main(String[] args) {
	int n = 4;
	char c='A';
	for(int i=1;i<=n;i++) 
	{
		
		for(int j=1;j<=n;j++)
		{ 
			if(i+j<=n+1) 
			{
			System.out.print(c+" ");
			}
			else 
			{
			System.out.print(" ");
		}
		}
		c++;
		System.out.println();
		}
}
}
