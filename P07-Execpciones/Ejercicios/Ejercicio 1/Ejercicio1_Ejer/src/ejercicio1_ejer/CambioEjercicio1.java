/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_ejer;

/**
 *
 * @author ADMIN
 */
public class CambioEjercicio1 {
    
    public static void main(String[] args) {
        double [] v = new double[15];
        acceso(v,16);
        System.out.println("TERMINO EL PROGRAMA CORRECTAMENTE");
    }
    
    public static double acceso(double[] v, int j) throws  RuntimeException{
        try{
            if(j>=0 && j<=v.length)
                return v[j];
            else
                throw new RuntimeException("El indice "+j+" no existe en el vector");
        }
        catch(Exception exc){
            System.out.println("Se controlo la excepcion");
        }
        finally{
            System.out.println("Continua el programa ");
        }
    return 0;
    }
}
