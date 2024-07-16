package Patternprograms;
/*
 
      *       
    * * *     
  * * * * *   
* * * * * * * 
  * * * * *   
    * * *     
      *       


 */
public class Pattern26 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<n*2;i++) 
		{
			for(int j=1;j<n*2;j++) //n*2
			{
				if(i+j>n  && i-j<n && j-i<n && i+j<n*3 )//i+j>n  && i-j<n && j-i<n && i+j<n*3
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
