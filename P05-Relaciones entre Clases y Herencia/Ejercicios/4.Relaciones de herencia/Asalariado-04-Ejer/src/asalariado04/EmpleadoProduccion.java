/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asalariado04;

/**
 *
 * @author Alumno
 */
public class EmpleadoProduccion extends Asalariado{
    
    private String turno;

    public EmpleadoProduccion(String Nombre, long dni, int diasVacaciones, double Salario,String turno) {
        super(Nombre, dni, diasVacaciones, Salario);
        this.turno = turno;
    }

    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
     public double CalNominaProduccion(double salario){
        
        return salario+(salario*15/100);
    }

    @Override
    
    public String toString() {
        return "Empleado Producción" + "\n Nombre=" + getNombre() + "\n dni=" + getDni() + "\n Vacaciones=" + getDiasVacaciones() + "\n Salario=" + CalNominaProduccion(getSalario())+ "\n Turno=" +turno+'\n' ;
    }
    
    
}
