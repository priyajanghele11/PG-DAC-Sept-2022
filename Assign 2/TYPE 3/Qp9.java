class Qp9{
public static void main(String[] args){
int rows1=5, rows2=4;
for(int i=1;i<=5;i++)
{
   for(int k=rows1;k>i;k--)   //space       
   {
       System.out.print(" "); 
	 }  
  for(int j=1;j<=i;j++)
  {
    System.out.print("*");
	}
	System.out.println();
  }

for(int i=rows2-1;i>=0;i--)
{ 
  for(int k=rows2;k>i;k--)   //space       
   {
       System.out.print(" "); 
	 }
  for(int j=0;j<=i;j++)
  {
    System.out.print("*");
	}
	
	System.out.println();
	 
  }
}
}
/*output:-
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/


