class Pattern2{
public static void main(String[] args){
 int alphabet=65;
 
 for(int i=0;i<=5;i++)//row
 {
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
 AB
 ABC
 ABCD
 ABCDE
 