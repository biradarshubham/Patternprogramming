package Patternprograms;

/*

* * * * * * * 
  * * * * *   
    * * *     
      *       
    * * *     
  * * * * *   
* * * * * * * 

 */
public class Pattern23 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<n*2;i++) 
		{
			for(int j=1;j<n*2;j++) //n*2
			{
				if( j>=i && i+j<=n*2 || i+j>=n*2 && i>=j)//|| i+j>=n*2 && i>=j
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
