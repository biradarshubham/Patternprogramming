package Patternprograms;
/*

1  2  3  4  
5  6  7  8  
9 10 11 12 
13 14 15 16 
 
 */
public class NumberPattern6 {
	public static void main(String[] args) {
		int n=4;
		int count=1;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++)
			{
				if(count<9) {
				System.out.print(count+"  ");
				}else {
					System.out.print(count+" ");
				}
				count++;
			}
			System.out.println();
			}
	}
}
