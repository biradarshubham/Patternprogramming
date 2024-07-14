package Patternprograms;

/*
*       
* *     
* * *   
* * * * 
* * *   
* *     
* 
 */
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<n*2;i++) 
		{
			for(int j=1;j<=n;j++) //n*2
			{
				if(j<=i && i+j<=n*2)
				{                                                                                                                   
					System.out.print("* ");
				}else 
				{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
	}

}
