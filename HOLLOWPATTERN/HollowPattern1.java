package Patternprograms;

/*

      *       
    *   *     
  *       *   
* * * * * * * 

 */
public class HollowPattern1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<n*2;j++) //n*2
			{
				if(i+j==n+1 || i==n || j-i==n-1)//i+j>n+1
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
