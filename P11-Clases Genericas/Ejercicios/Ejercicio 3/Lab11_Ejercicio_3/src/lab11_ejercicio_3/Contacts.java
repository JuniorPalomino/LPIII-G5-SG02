/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_ejercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 * @param <K>
 * @param <V>
 */
public class Contacts<K,V> extends Dictionary {
    
    private ArrayList<Contacts> ArregloContactos;
     
    

    public Contacts(OrderedPair par) {
        super(par);
    }

    public Contacts(ArrayList ArregloContactos) {
        super(ArregloContactos);
    }
    
    public ArrayList<Contacts> getArregloContactos() {
        return ArregloContactos;
    }

    public void setArregloContactos(ArrayList<Contacts> ArregloContactos) {
        this.ArregloContactos = ArregloContactos;
    }
   
    
   }
    
    

   

     
    
    
    
    
   
