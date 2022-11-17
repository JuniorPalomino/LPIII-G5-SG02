/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02_practica_10;


/**
 *
 * @author ADMIN
 */
public class Ejercicio_02_Practica_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        
        
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        try {
            CambiarPosicion(intArray, intArray[2], intArray[1]);                //Llama al metodo
        } catch (Exception ex) {
            System.out.printf("Error en escoger los valores\n");
        }
        
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        try {
            CambiarPosicion(doubleArray, doubleArray[6], doubleArray[-1]);        //Llama al metodo
        } catch (Exception ex) {
            System.out.printf("Error en escoger los valores\n");
        }
        
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        try {
            CambiarPosicion(charArray, charArray[1], charArray[2]);              //Llama al metodo
        } catch (Exception ex) {
            System.out.printf("Error en escoger los valores\n");
        }
    }
    
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println("\n");
    }

    public static <T> void CambiarPosicion(T[] arreglo, T t1, T t2) throws Exception {
        
        try {
            
        arreglo.equals(t1);
        arreglo.equals(t2);
        
        }catch(Exception ex){
            
            throw new Exception();
            
        }
    
        T aux;
        int pos1 = 0, pos2 = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == t1) {
                pos1 = i;
            }
            if (arreglo[i] == t2) {
                pos2 = i;
            }
        }
        aux=arreglo[pos1];
        arreglo[pos1] = arreglo[pos2];
        arreglo[pos2] = aux;
        imprimirArray(arreglo);
    }
    
    

}
