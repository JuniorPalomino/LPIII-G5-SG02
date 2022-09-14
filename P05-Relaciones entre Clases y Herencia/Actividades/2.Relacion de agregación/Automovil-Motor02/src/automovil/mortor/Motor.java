/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil.mortor;

/**
 *
 * @author Alumno
 */
public class Motor {
    
    private int numMotor;
    private int Revoluciones;

    public Motor(int numMotor, int Revoluciones) {
        this.numMotor = numMotor;
        this.Revoluciones = Revoluciones;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public int getRevoluciones() {
        return Revoluciones;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setRevoluciones(int Revoluciones) {
        this.Revoluciones = Revoluciones;
    }

    @Override
    public String toString() {
        return "Motor{" + "numMotor=" + numMotor + ", Revoluciones=" + Revoluciones + '}';
    }
    
}
