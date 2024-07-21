package Patternprograms;
/*

a       
b c     
d e f   
g h i j 
 
 */
public class CharPattern6 {
	public static void main(String[] args) {
		int n = 4;
		char c='a';
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{ 
				if(i>=j) 
				{
				System.out.print(c+" ");
				c++;
				}
				else 
				{
				System.out.print("  ");
//				c++;
			}
//				c++;
			}
			System.out.println();
			}
	}
}
