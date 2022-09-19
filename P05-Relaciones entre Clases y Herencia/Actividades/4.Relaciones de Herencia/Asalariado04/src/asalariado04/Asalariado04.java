/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalariado04;

/**
 *
 * @author Alumno
 */
public class Asalariado04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Asalariado emplead1= new Asalariado("Juan Perez",28339187,5,3500);
        EmpleadoProduccion emplead2=new EmpleadoProduccion("Rocio Fernandez",35289129,10,4000,"Tarde");  //Corregir salario
        EmpleadoDistribucion emplead3=new EmpleadoDistribucion("Deny Cruz",12718935,0,3800,"Centro");
        
        System.out.println("El nombre del empleado 1 es: "+ emplead1.getNombre());
        System.out.println("El nombre del empleado 2 es: "+ emplead2.getNombre());
        System.out.println("El turno del empleado 2 es: "+ emplead2.getTurno());
        System.out.println("El nombre del empleado 3 es: "+ emplead3.getNombre());
        System.out.println("La region del empleado 3 es: "+ emplead3.getRegion());
     
        
        
        
        
   /**
       System.out.println( "empleados Asalarios" );
       
       System.out.println( "dni" );
       
       System.out.println( "nombres" );
       
       System.out.println( "vacaciones" );
       
       System.out.println( "salario" );
       
//___________________________________+______________________________________
   
       System.out.println( "empleados de produccion" );
       
       System.out.println( "dni" );
       
       System.out.println( "nombres" );
       
       System.out.println( "vacaciones" );
       
        System.out.println( "salario" );        
//___________________________________+______________________________________
   
       System.out.println( "empleados de distribucion" );
       
       System.out.println( "dni" );
       
       System.out.println( "nombres" );
       
        System.out.println( "vacaciones" );
       
        System.out.println( "salario" );
       

      **/  
       


                
    }
    
}
