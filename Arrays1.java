import java.util.Scanner;
import java.util.Arrays;

public class Arrays1 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String[] arr;                             //declaration of array in stack
        arr = new String[4];                                   // initialization of array created in heap 
        // System.out.println(arr[0]);
        arr[2]="vivek";                              //to modify an array

        for (String element : arr) 
        {
            System.out.println(element);
        
        }


        
        
    }
}                // for each loop is equivalent to 

// for (int i=0; i<arr.length; i++) 
// { 
//     type var = arr[i];
//     statements using var;SOP
// }


//for (type var : array) 
// { 
//     statements using var;SOP
// }