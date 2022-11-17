/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10_actividad_2;

/**
 *
 * @author ADMIN
 */
public class Lab10_Actividad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        System.out.printf("Array integerArray contiene:%n");
        try {
            imprimirArray(intArray,6,7);
        } catch (LimiteInvalidoException ex) {
            ex.mensaje();
        }
        System.out.printf("%nArray doubleArray contiene:%n");
        try {
            imprimirArray(doubleArray,-1,4);
        } catch (LimiteInvalidoException ex) {
            ex.mensaje();
        }
        System.out.printf("%nArray charArray contiene:%n");
        try {
            imprimirArray(charArray,2,3);
        } catch (LimiteInvalidoException ex) {
            ex.mensaje();
        }
        
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        
    }
    
    public static <T> void imprimirArray(T[] Arreglo, int LimiteInferior, int LimiteSuperior) throws LimiteInvalidoException {     //obliga try catch porque hereda de exception
        int PosicionMayor = Arreglo.length -1;
        
        
        if (LimiteSuperior<LimiteInferior){
            
            throw new LimiteInvalidoException();
        
        }
        if (LimiteSuperior>PosicionMayor){
            
            throw new LimiteInvalidoException();
        
        }
        if (LimiteInferior<0){
            
            throw new LimiteInvalidoException();
        
        }
        
        for (int i=LimiteInferior;i<=LimiteSuperior;i++) {
           System.out.println(Arreglo[i]); 
        }    
      
    }

}

