package Patternprograms;
/*
 
A A A A 
B B B B 
C C C C 
D D D D 
 
 */
public class CharPattern2 {
	public static void main(String[] args) {
		int n=4;
		char c='A';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{	
				System.out.print(c+" ");
			}
			c++;
			System.out.println();
			}
	}
}
//or
//int c=65;
//sop((char)c);