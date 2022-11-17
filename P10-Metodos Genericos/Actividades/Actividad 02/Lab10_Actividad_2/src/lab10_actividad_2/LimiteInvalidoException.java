/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10_actividad_2;

/**
 *
 * @author ADMIN
 */
class LimiteInvalidoException extends Exception {
   
        

    public LimiteInvalidoException() {
        
    }
    public LimiteInvalidoException(String mensaje) {
        
        super(mensaje);
        
    }
    
    public void mensaje() {
        
        System.out.printf("¡Limites Incorrectos!¡Fuera de Rango!");
        
    }

 
    
}
