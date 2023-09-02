import java.util.Arrays;

public class Swap 
{
    static void swap(int[] arr, int ind1, int ind2)
    {
        int temp=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }

    static void reverse(int[] arra)
    {
        int start=0;
        int end=arra.length-1;
        while(start<end)
        {
            swap(arra, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        int[] a={2,56,8,46,6,59,658};
        swap(a, 2,5);
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));

        

        
    }
    
}
