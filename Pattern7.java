package Patternprograms;

/*

*           * 
  *       *   
    *   *     
      *       
    *   *     
  *       *   
*           * 


*/
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++) 
			{
				if(i==j  || j+i==a+1)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}

}

