 
import java.util.Scanner;
import java.util.Arrays;


public class imputofarray
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={45,65,25,68,61};
        for (int i=0;i<=arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}


