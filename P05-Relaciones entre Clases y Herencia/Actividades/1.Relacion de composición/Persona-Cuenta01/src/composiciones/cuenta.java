/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composiciones;

/**
 *
 * @author Alumno
 */
public class cuenta {
    private int numero;
    private double saldo;
    
    public cuenta(int numero,double saldo){
        this.saldo= saldo;
        this.numero = numero;
    }
    public cuenta(int numero){
        this(numero,0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "cuenta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }

    

}
