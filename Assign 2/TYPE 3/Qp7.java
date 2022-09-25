class Qp7{
public static void main(String[] args){
int rows1=5, rows2=4;
for(int i=1;i<=rows1;i++)
{
   for(int k=rows1;k>i;k--)   //space       
   {
       System.out.print(" "); 
	 }  
  for(int j=1;j<=(i*2)-1;j++)
  {
    System.out.print("*");
	}
	System.out.println();
  }

for(int i=rows2;i>=1;i--)
{ 
  for(int k=rows2;k>=i;k--)   //space       
   {
       System.out.print(" "); 
	 }
  for(int j=1;j<=(i*2)-1;j++)
  {
    System.out.print("*");
	}
	
	System.out.println();
	 
  }
}
}
/*output:-
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/


