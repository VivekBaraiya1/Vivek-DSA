import java.util.Scanner;
import java.util.Arrays;

public class input2darr 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][3];
        for(int rows=0;rows<a.length;rows++)
         {
            for( int col=0;col<a[rows].length;col++)
            {
                System.out.println("enter rows");5
                a[rows][col]=sc.nextInt();
                System.out.print(a[rows][col] +" ");

            }
            System.out.println();
        }

            
        
    }
    
}
