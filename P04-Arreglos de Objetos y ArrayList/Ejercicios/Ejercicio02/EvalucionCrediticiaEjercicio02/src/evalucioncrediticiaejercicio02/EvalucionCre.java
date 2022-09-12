/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evalucioncrediticiaejercicio02;

/**
 *
 * @author ADMIN
 */
public class EvalucionCre{
    private int Sexo;
    private int Trabajo;
    private int Sueldo;
    
    public EvalucionCre(int sexo, int trabajo, int sueldo)
    {
        this.Sexo = sexo;
        this.Trabajo = trabajo;
        this.Sueldo = sueldo;
    }

    public int getSexo() {
        return Sexo;
    }

    public int getTrabajo() {
        return Trabajo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSexo(int sexo) {
        this.Sexo = sexo;
    }

    public void setTrabajo(int trabajo) {
        this.Trabajo = trabajo;
    }

    public void setSueldo(int sueldo) {
        this.Sueldo = sueldo;
    }
    
     
}