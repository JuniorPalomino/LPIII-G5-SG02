/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11_ejercicio_2;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ADMIN
 */
public class Lab11_Ejercicio_2<T>{
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ObjectNoExist {
        // TODO code application logic here
        
       OrderedPair A = new OrderedPair(2,2);   //Par Ordenado asginamos
       OrderedPair B = new OrderedPair(4,7);
       OrderedPair C = new OrderedPair("HOLA",7);
       OrderedPair D = new OrderedPair(1.4,"gato");
        
       Dictionary  PrimerPar = new Dictionary(A);   //Pares Ordenados
       Dictionary  SegundoPar = new Dictionary(B);
       Dictionary  TercerPar = new Dictionary(C);
       Dictionary  CuartoPar = new Dictionary(D);
  
       ArrayList<Dictionary> Lista =new ArrayList<Dictionary>();
       
       Lista.add(PrimerPar);
       Lista.add(SegundoPar);
       Lista.add(TercerPar);
       Lista.add(CuartoPar);

       Dictionary DiccionarioArreglo = new Dictionary(Lista);
       
       
       
       DiccionarioArreglo.add(2,3);
       DiccionarioArreglo.add(5,2);
       
       DiccionarioArreglo.ToString();
       
       DiccionarioArreglo.delete(2);
       DiccionarioArreglo.delete("HOLA");
       DiccionarioArreglo.delete(1.8);
       
       DiccionarioArreglo.getValue(2); 
       
       DiccionarioArreglo.ToString();
       
       
       
       
       
       
        
      
        
     
        
      
        
        
       
      
        
    }
    
}
