/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_actividad.pkg1;

/**
 *
 * @author Alumno
 */
public class Estudiante extends Persona {
    
    private String Especialidad;
    private Procedencia procedencia;

    public Estudiante(String Especialidad, Procedencia procedencia, String nombres, String direccion, String telefono) {
        super(nombres, direccion, telefono);
        this.Especialidad = Especialidad;
        this.procedencia = procedencia;
    }
    public Estudiante(String nombres,Procedencia procedencia) {
        super(nombres);
        this.procedencia = procedencia;
    }
    public Estudiante() {
        
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }
    
}
