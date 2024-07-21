package Patternprograms;
/*
 
a       
a b     
a b c   
a b c d 
a b c   
a b     
a       

 */
public class CharPattern12 {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=1;i<n*2;i++) 
		{
			char c='a';
			for(int j=1;j<=n;j++) //n*2
			{
				if(j<=i && i+j<=n*2)
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
