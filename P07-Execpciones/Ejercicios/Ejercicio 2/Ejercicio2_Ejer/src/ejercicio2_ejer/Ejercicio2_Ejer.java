/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_ejer;

/**
 *
 * @author ADMIN
 */
public class Ejercicio2_Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
            System.out.println(metodo("w"));
        }
        catch(Exception e){
            System.out.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
    private static int metodo(String num){
        int valor=0;
        try{
            valor++;
            valor+=Integer.parseInt(num);
            valor++;
            System.out.println("Valor al final del try: "+valor);
        }
        catch(NumberFormatException e){
            valor+= Integer.parseInt("42");
            System.out.println("Valor al final del catch: "+valor);
            throw e;
        }
        finally{
            valor++;
            System.out.println("Valor al final del finally: "+valor);
        }
        valor++;
        System.out.println("Valor antes del return: "+valor);
        return valor;
    }
}
    

