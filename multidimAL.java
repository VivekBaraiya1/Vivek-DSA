import java.util.ArrayList;
import java.util.Scanner;
public class multidimAL 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for (int i=0;i<3;i++)            //initalization 
        {
            list.add(new ArrayList<>());            //            list.add(new ArrayList<>());  
            //so if we do not write this intialization then the add element will show error as first to list is empty so which list are you talking aboutx         
        }
        //add elements
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                list.get(i).add(sc.nextInt());

            }
        }
        System.out.println(list);
    }
    
}
