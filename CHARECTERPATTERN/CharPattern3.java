package Patternprograms;
/*
 
A B C D 
E F G H 
I J K L 
M N O P 
 
 */
public class CharPattern3 {
	public static void main(String[] args) {
		int n=4;
		char c='A';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{	
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
			}
	}
}
