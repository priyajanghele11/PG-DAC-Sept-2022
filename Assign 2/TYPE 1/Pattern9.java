class Pattern9
{
public static void main(String[] args){

 int alphabet=65;
 for(int i=0;i<=5;i++)//row
 {
    for(int j=6;j>=i;j--)   //space
   {
       System.out.print(" "); 
	 }
   for(int j=0;j<=i;j++)//column
   {
	 System.out.print((char)(alphabet+j)+"  ");
	}
	System.out.println();
   }
  }
}

/*output:-  


     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
*/