class Pattern16
{
public static void main(String[] args){

 int rows=5; 
 for(int i=rows;i>=1;i--)//row
 {
    for(int j=0;j<0;j++)   //space
   {
       System.out.print(" "); 
	 }
   for(int j=rows;j>=i;j--)//column
   {
	 System.out.print(j+"  ");
	}
	System.out.println();
   }
  }
}

/*
output:-
5
5 4
5 4 3 
5 4 3 2 
5 4 3 2 1 
*/