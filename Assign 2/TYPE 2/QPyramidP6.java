class QpyramidP6
{
public static void main(String[] args){

 int rows=9;
 for(int i=0;i<=rows-1;i++)//row
 {
    for(int j=1;j<=i;j++)   //space
   {
       System.out.print(" "); 
	 }
   for(int j=0;j<=rows-1-i;j++)//column
   {
	 System.out.print(" * ");
	}
	System.out.println();
   }
  }
}

/*output:-
 *  *  *  *  *  *  *  *
  *  *  *  *  *  *  *
   *  *  *  *  *  *
    *  *  *  *  *
     *  *  *  *
      *  *  *
       *  *
        *
		
*/