/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automovil.mortor;

/**
 *
 * @author Alumno
 */
public class Automovil {
    private String Placa;
    private int Puertas;
    private String Marca;
    private String Modelo;
    private Motor motor; 

    public Automovil(String Placa, int Puertas, String Marca, String Modelo) {
        this.Placa = Placa;
        this.Puertas = Puertas;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public String getPlaca() {
        return Placa;
    }

    public int getPuertas() {
        return Puertas;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Placa=" + Placa + ", Puertas=" + Puertas + ", Marca=" + Marca + ", Modelo=" + Modelo + ", motor=" + motor + '}';
    }

    
}
