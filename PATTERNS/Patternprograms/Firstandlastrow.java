package Patternprograms;

/*
* * * * 
    
    
* * * * 
 */
public class Firstandlastrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++) 
			{
				if(i==1 || i==a) 
				{
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		}
}

	
