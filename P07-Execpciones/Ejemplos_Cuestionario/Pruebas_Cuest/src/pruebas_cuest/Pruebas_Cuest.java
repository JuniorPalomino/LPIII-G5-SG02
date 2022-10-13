/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas_cuest;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Pruebas_Cuest {
     private int num;

    public Pruebas_Cuest(int num) {
        this.num = num;
        invariante();
    }
    
    private void invariante(){
        assert(num>0):"EL numero debe ser positivo";
    
    }
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //////////////////////Cuestionario 1/////////////////////
        Pruebas_Cuest Objeto=new Pruebas_Cuest(-5);
        
        
        
        //////////////////Cuestionario 2/////////////////////////
        /*
        int n=10,y,z;
        
        Scanner sc= new Scanner(System.in);
        
        
        try{
            System.out.println("Ingresa un valor para dividir 10 : ");
            y= sc.nextInt();
            z=n/y;
            System.out.println("El resultado es : " + z );
        }

        catch(InputMismatchException Error1){
            System.out.println("Error!! No es entero");
        }
        catch(ArithmeticException Error2){
            System.out.println("Error!! No se puede dividir entre cero");
        }
        catch(Exception Error3){
            System.out.println("Error!!");
        }
        */
    }
    
}
