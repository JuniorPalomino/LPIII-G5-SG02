/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miproyect;

/**
 *
 * @author Alumno
 */
public class diagnostico  {

    public void aptoVacunaA(perro p) {
        aptoVacunaB(p.peso, p.getEdad(), p.getTemp());
    }

    public void aptoVacunaB(double peso, int edad, double temp) {
        if (temp >= 37 && temp <= 40 && peso > 5 && edad > 1) {
            System.out.println("DIAGNOSTICO: El perro esta sano");
        } else {
            System.out.println("DIAGNOSTICO: El perro esta enfermo");
        }
    }

}
