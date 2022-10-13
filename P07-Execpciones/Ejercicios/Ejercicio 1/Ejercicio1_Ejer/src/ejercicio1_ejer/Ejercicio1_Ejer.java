/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_ejer;

/**
 *
 * @author ADMIN
 */
public class Ejercicio1_Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] v = new double[15];
        acceso(v,16);
    }
    
    public static double acceso(double[] v, int j) throws  RuntimeException{
        try{
            if(j>=0 && j<=v.length)
                return v[j];
            else
                throw new RuntimeException("El indice "+j+" no existe en el vector");
        }
        catch(Exception exc){
            throw exc;
        }
        
    }
}


