package Patternprograms;
/*
 
a b c d 
  b c d 
    c d 
      d 
      
 */
public class CharPattern5 {
	public static void main(String[] args) {
		
	int n = 4;
	for(int i=1;i<=n;i++) 
	{
		char ch='a';
		for(int j=1;j<=n;j++){ 
			if(j>=i) {
			System.out.print(ch+" ");
			ch++;
			}
			else 
			{
			System.out.print("  ");
			ch++;
		}
		}
		System.out.println();
		}
}
}//it showuld be right side upper trangle

//a a a a 
//b b b 
// c c 
//  d 

//int n = 4;
//char c='a';
//for(int i=1;i<=n;i++) 
//{
//	
//	for(int j=1;j<=n;j++)
//	{ 
//		if(j>=i) 
//		{
//		System.out.print(c+" ");
//		}
//		else 
//		{
//		System.out.print(" ");
//	}
//	}
//	c++;
//	System.out.println();
//	}