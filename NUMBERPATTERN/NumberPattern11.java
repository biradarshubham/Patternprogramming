package Patternprograms;

public class NumberPattern11 {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{	
			int k=1;
			for(int j=1;j<=n;j++)
			{
				if(i<=j) 
				{
					System.out.print(k++ +" ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}
}
//get wrong