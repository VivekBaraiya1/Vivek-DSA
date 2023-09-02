import java.util.ArrayList;
import java.util.Scanner;

public class arraylist 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(65);
        list.add(6);
        list.add(5);
        list.add(655);
        list.add(657);
        list.add(45);
        list.add(555);
        list.add(6985);
        System.out.println(list.contains(657));
        System.out.println(list);
        list.set(0, 45);
        list.remove(2);
        System.out.println(list);
        
        
        //input
        for(int i=0;i<5;i++)
        {
            // list.add(sc.nextInt());                                 //to add in list by taking input 
             System.out.println(list.get(i));              //to get list till certain index
            
            
        }
        System.out.println(list);

    
    
    }

    
}
