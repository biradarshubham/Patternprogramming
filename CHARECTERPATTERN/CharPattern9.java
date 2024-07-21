package Patternprograms;
/*
 
a e i m 
b f j n 
c g k o 
d h l p 

 */
public class CharPattern9 {
	public static void main(String[] args) {
		int n = 4;
		char c='a';
		for(int i=1;i<=n;i++) 
		{
			char ch=c;
			for(int j=1;j<=n;j++)
			{ 
				System.out.print(ch+" ");
				ch+=n;
			}
			c++;
			System.out.println();
			}
	}
}
