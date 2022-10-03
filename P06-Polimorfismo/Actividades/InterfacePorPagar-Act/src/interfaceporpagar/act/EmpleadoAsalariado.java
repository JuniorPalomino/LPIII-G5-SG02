/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceporpagar.act;

/**
 *
 * @author ADMIN
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
        super(nombre, apellido, nss);
        setSalarioSemanal(salario);

    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "\n EmpleadoAsalariado: " + "\n salarioSemanal=" + salarioSemanal;
    }

}
