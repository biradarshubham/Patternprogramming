package Patternprograms;

/*
 
      *       
    * * *     
  *   *   *   
* * * * * * * 
  *   *   *   
    * * *     
      *       

 
 */
public class HollowPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=1;i<n*2;i++) 
		{
			for(int j=1;j<n*2;j++)
			{
				if(i+j==n+1 || i-j==n-1 || j-i==n-1 || i+j==n*3-1 || j==n || i==n)
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