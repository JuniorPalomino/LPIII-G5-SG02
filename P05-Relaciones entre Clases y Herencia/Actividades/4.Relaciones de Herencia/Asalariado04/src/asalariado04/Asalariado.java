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
    private int Salario;

    public Asalariado(String Nombre, long dni, int diasVacaciones,int Salario) {
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

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        this.Salario = salario;
    }
     
    
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
        
    public int CalNominaAsalariado(int salario){
        
        return 0;
    
        
        
    }

    @Override
    public String toString() {
        return "Asalariado{" + "Nombre=" + Nombre + ", dni=" + dni + ", diasVacaciones=" + diasVacaciones + ", Salario=" + Salario + '}';
    }
}
