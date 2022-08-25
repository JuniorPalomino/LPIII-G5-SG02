/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerproyecto;

/**
 *
 * @author ADMIN
 */
public class Diagnostico extends Perro {
    public void aptoVacunaB(Perro p)
    {
        if(p.getTemp()>=37 && p.getTemp()<=40 && p.peso>5 && p.getEdad()>1)
            System.out.println("DIAGNOSTICO: El perro esta sano");
        else
            System.out.println("DIAGNOSTICO: El perro esta enfermo");
    }
    
}
