package Patternprograms;

/*
*     * 
*     * 
*     * 
*     * 
 */
public class FirstandlastCloumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++) 
			{
				if(j==1 || j==a)
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
