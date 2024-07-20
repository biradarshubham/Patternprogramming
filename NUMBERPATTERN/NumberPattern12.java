package Patternprograms;
/*

4 3 2 1 
  4 3 2 
    4 3 
      4 
 
 */
public class NumberPattern12 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			int k=n;
			for(int j=1;j<=n;j++)
			{
				if(j>=i)
				{
					System.out.print(k+" ");
					k--;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}
}
