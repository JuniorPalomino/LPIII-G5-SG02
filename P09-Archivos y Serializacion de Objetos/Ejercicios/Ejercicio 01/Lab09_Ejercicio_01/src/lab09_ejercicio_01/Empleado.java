/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09_ejercicio_01;

/**
 *
 * @author ADMIN
 */
public class Empleado {

    private int Numero;
    private String Nombre;
    private double Sueldo;

    public Empleado(int Numero, String Nombre, double Sueldo) {
        this.Numero = Numero;
        this.Nombre = Nombre;
        this.Sueldo = Sueldo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    

}
