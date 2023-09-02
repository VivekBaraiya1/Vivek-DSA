public class MAX 
{
    static int max(int[] arr)
    {
       
       int maxval=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxval)
            {
                maxval=arr[i];
            }

        }
        return maxval;
    }
    public static void main(String[] args) 
    {
        int[] a={555,45,5631,2555555,4568};        //find maximum item in this 
        System.out.println(max(a));
    }
    
}

