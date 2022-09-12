
package lab4;

public class Lab4 {

    public static void main(String[] args) {
       int[]arreglo1={2,4,6,8,10,12};
        System.out.println("Primer arreglo ");
       for(int a:arreglo1)
           System.out.println(a);
       
       int [][]arreglo2={{1,3,5},{2,4,6},{2,3,5}};
        
        System.out.println("Segundo arreglo ");
       for(int i=0;i<arreglo2.length;i++)
       {
           for(int j=0;j<arreglo2[i].length;j++)
           {
               System.out.printf("%d ",arreglo2[i][j]);
           }
           System.out.println();
       }
       
    }

}
