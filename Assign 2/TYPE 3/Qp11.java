class Qp11{
public static void main(String[] args){
int rows=5;
for (int i= rows-1; i>=0 ; i--)
    {
	for(int j=4;j>=i;j--)
	{
	   System.out.print(" ");
     }	
    for (int j=0; j<=i; j++)
    {
    System.out.print("*");
    }
    System.out.println();
    }

  for(int i=1;i<=5;i++)
{
   for(int j=5;j>=i;j--)   //space     
       System.out.print(" "); 
	 }  
  for(int j=1;j<=i;j++)
  {
    System.out.print("*");
	}
	System.out.println();
	}
	}
	}

/*output:-
 *****
  ****
   ***
    **
     *
     *
    **
   ***
  ****
 *****
 
 */
