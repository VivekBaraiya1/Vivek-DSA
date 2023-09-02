public class numberofcolumnnotfixedS
{
    public static void main(String[] args) 
    {
        int[][] a={
            {1 ,2 ,5 ,6 },
            {45 ,5 },
            {54 ,55 ,58 ,65 }
         };
         for(int rows=0;rows<a.length;rows++)
         {
            for( int col=0;col<a[rows].length;col++)
            {
                System.out.print(a[rows][col] +" ");                       //keep in mind here it is print not println

            }
              System.out.println();
         }
       
    }
    
}
