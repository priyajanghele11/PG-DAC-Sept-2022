class Pattern18{
public static void main(String[] args){

int alphabet=65;
for (int i=5; i>=0; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print((char)(alphabet+j)+" ");
    }
    System.out.println();
    }
 }
} 

/*output:-
A B C D E F
A B C D E
A B C D
A B C
A B
A

*/