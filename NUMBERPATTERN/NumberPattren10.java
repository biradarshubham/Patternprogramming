package Patternprograms;
/*
 
1 
1 2 
1 2 3 
1 2 3 4 
 
 */
public class NumberPattren10 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i) {
					System.out.print(j+" ");					
				}
			}
			System.out.println();
	}
	}
}
