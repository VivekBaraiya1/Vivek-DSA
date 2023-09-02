import java.util.Arrays;
public class passingafunction
{
    static void change(int[] arr)                       //  we need to call it outside main function but inside class 
    {
      arr[0]=45;
    } 
    public static void main(String[] args) {
        int a[]={8,5,2,6,5};
        System.out.println(Arrays.toString(a));                           // internally uses for loop togive output
        change(a);
        System.out.println(Arrays.toString(a));                      
        
        
        
        // for (int i=0;i<5;i++)
        // {                                                              //print array in form of list
        //     System.out.println(a[i]);
        // }
    }   
    
}
