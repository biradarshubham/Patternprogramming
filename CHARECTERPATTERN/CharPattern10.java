package Patternprograms;
/*
 
      a         
    b c d       
  e f g h i     
j k l m n o p   
  q r s t u     
    v w x       
      y         
                
 */
public class CharPattern10 {
	public static void main(String[] args) {
		int n=4;
		char c='a';
		for(int i=1;i<=n*2;i++)
		{
			for (int j=1;j<=n*2;j++) 
			{
				if(i+j>n  && i-j<n && j-i<n && i+j<n*3 )
				{                                                                                                                   
					System.out.print(c+" ");
					c++;
				}else 
				{
					System.out.print("  ");
				}
			}
		System.out.println();
	}
	}
}
