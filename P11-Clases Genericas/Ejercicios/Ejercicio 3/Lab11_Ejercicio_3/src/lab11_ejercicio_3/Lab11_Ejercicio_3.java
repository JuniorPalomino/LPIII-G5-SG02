/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11_ejercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Lab11_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ObjectNoExist {
        // TODO code application logic here
       
       
       ArrayList<Dictionary> ListaRegistro =new ArrayList<Dictionary>();
       
       Contacts RegistroContactos= new Contacts(ListaRegistro);
           
       
        int clave;
        String valor;
        
        Scanner IngresoValores = new Scanner(System.in);
        
        
        
        boolean salir=true;
        
        while(salir){
            
            int opc = 0;
            System.out.println("==========MENU=========");
            System.out.println("------------------------------");
            System.out.println("    1. INGRESAR CONTACTO      ");
            System.out.println("    2. BORRAR CONTACTO        ");
            System.out.println("    3. MOSTRAR UN SOLO CONTACTO          ");
            System.out.println("    4. MOSTRAR TODOS LOS CONTACTOS        ");
            System.out.println("    5. SALIR                  ");
            System.out.println("------------------------------");

            do{
                
                System.out.print("Ingrese su opcion:  ");
                opc = IngresoValores.nextInt();
                
            }while(opc<1 || opc>5);
           
            switch(opc){
                case 1:
                    System.out.print("Ingrese el DNI: ");
                    clave=IngresoValores.nextInt();
                    System.out.print("Ingrese los Datos: ");
                    valor=IngresoValores.next();
                    RegistroContactos.add(clave, valor);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI a borrar: ");
                    clave=IngresoValores.nextInt();
                    boolean Verdadero = RegistroContactos.delete(clave);
                    if(!Verdadero){
                        System.out.println("No se encuentra o ingreso mal");
                    }
                    else
                        System.out.println("Eliminacion Correcta");
                    break;
                case 3:
                    try {
                    System.out.print("Ingrese el DNI a mostrar: ");
                    clave=IngresoValores.nextInt();
                    RegistroContactos.getValue(clave);
                    }catch(ObjectNoExist e){
                        System.out.println("El DNI ingresado no existe en los contactos");
                    }
                    break;
                case 4:
                    RegistroContactos.ToString();
                    break;
                case 5:
                    salir = false;
                    break;
            }
        }
    }
       
       
   }
    

