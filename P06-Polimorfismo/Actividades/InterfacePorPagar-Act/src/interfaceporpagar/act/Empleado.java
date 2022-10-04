/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceporpagar.act;

/**
 *
 * @author ADMIN
 */
public abstract class Empleado implements PorPagar {
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    public Empleado(String nombre,String apellido,String nss){
        
        primerNombre=nombre;
        apellidoPaterno=apellido;
        numeroSeguroSocial=nss;
    }
    
   
    }
    

