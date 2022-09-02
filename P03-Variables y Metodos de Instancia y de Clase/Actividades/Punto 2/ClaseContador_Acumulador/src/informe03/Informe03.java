/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informe03;

/**
 *
 * @author Alumno
 */
public class Informe03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicycle a,b;
        a= new Bicycle("Adam Smith",1); //Variables de Instancia
        b= new Bicycle("Ben Jones",5);  //Variables de Instancia
        
        a.distanceTraveled(240);     // Llama a un metodo y da un valor al parametro=Metodo de instancia
        
        System.out.println(b.getOwnerName());  //Imprime y llama a una variable de clase
        b.distanceTraveled(1100);    //Llama a un metodo y da un valor al parametro=Metodo de instancia  
        Bicycle most0ld = Bicycle.mostUsed(a, b); //Creamos un objeto del tipo Bicycle asignando los parametros= Utiliza metodo de Clase
        System.out.println(most0ld);     //Imprimimos el objeto 
        
    }
    
}
