package Patternprograms;
/*

A B C D 
A B C D 
A B C D 
A B C D 

 */
public class CharPattern1 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			char c='A';
			for(int j=1;j<=n;j++)
			{	
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			}
		}
}
//int c=65;
//sop((char)c);