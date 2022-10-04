/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos.y.estructura;

/**
 *
 * @author Alumno
 */
public class contador {
    static int acumulador = 0;   //Variable de clase
    private int valor;      //Variable de instancia 
    
    public static int acumulador (){   //Metodo de clase
        return acumulador;
    }
    public contador (int valor){    //Metodo de instancia
        this.valor = valor ;
        acumulador += valor;           
    }
    public void inc (){             //Metodo de instancia
        valor ++;
        acumulador ++;
    }
    public int getvalor(){          //Metodo de instancia
        return this.valor;
    }
}
