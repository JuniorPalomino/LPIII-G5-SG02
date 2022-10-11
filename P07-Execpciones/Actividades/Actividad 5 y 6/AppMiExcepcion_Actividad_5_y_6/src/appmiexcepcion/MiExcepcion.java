/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmiexcepcion;

/**
 *
 * @author ADMIN
 */
public class MiExcepcion extends Exception{         //Jala la clase "Exception" que ya esta incorporada en java
    
    public MiExcepcion(String mensajeError){        //Constructor 
        super(mensajeError);                        //Super envía el string al constuctor de la clase Exception 
    }
    
}
