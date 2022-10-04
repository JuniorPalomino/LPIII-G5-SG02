/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asalariado04;

/**
 *
 * @author Alumno
 */
public class Asalariado {
    private String Nombre;
    private long dni;
    private int  diasVacaciones;
    private double Salario;

    public Asalariado(String Nombre, long dni, int diasVacaciones,double Salario) {
        this.Nombre = Nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.Salario = Salario;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        this.Salario = salario;
    }
     
    
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
        
    public double CalNominaAsalariado(double salario){
        
        return salario;
     
    }

    @Override
    public String toString() {
        return "Empleado Asalariado" + "\n Nombre=" + Nombre + "\n dni=" + dni + "\n Vacaciones=" + diasVacaciones + "\n Salario=" + CalNominaAsalariado(getSalario()) + '\n';
    }
}
