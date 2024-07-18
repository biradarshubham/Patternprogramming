package Patternprograms;
/*

1 2 3 4 
5 1 2 3 
4 5 1 2 
3 4 5 1 

 
 */
public class NumberPattern7 {
	public static void main(String[] args) {
		int n=4;
		int count=1;
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(count+" ");
				if(count==5) 
				{
					count=1;
				}else {
					count++;
				}
			}
			System.out.println();
			}

	}
}
