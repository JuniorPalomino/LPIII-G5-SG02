/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composiciones;

/**
 *
 * @author Alumno
 */
public class persona {
    private int id;
    private String nombre;
    private String apellido;
    private cuenta cuenta;
    
    public persona(int id, String nombre,String apellido){
        this.id=id ;
        this.nombre= nombre;
        this.apellido=apellido;
        this.cuenta= new cuenta(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cuenta=" + cuenta + '}';
    }

}


