/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perfilmedico;

/**
 *
 * @author ADMIN
 */
public class PerfilMedi {
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private int Dia,Mes,Anio;      //Fecha de Nacimiento
    private double Altura;
    private double Peso;
    
    public PerfilMedi(String Nombre, String Apellido,String Sexo, double Altura,double Peso,int Anio,int Mes, int Dia) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Altura= Altura;
        this.Peso = Peso;
        this.Anio=Anio;
        this.Mes=Mes;
        this.Dia=Dia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }
    
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getAltura() {
        return Altura;
    }
    
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getDia() {
        return Dia;
    }
    
    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getMes() {
        return Mes;
    }
    
    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getAnio() {
        return Anio;
    }
    
    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

 
     
     @Override
    public String toString() {
        return "Perfil Medico{" + "Nombre: " + Nombre + ", Apellido: " + Apellido +",Sexo:" + Sexo +", Altura: " + Altura +", Peso: " + Peso +", Fecha de Naciemiento: "+ Dia+"/"+ Mes+"/"+ Anio+'}';
    }
    
    public int CalcularEdad(int anio,int mes, int dia){
     
        int _edad;
        anio=2022-anio;
        if(8>=mes)
        {
            if (28>=dia){
                
                 _edad=anio;
            }
            else{
                
                _edad=anio-1;
            }
        }
        else{
                _edad=anio-1;
         }
        
        System.out.println("Su edad es: "+_edad );
        
    return _edad;
    }
    public double FMC(int edad )
           
    {
        double _fmc;
        _fmc= 208-(0.7*edad);
        System.out.println("La Frecuencia Cardiaca Máxima es de: "+  _fmc );
        return _fmc;
    }
    public double IMC(double Peso, double Altura)
    {
        Altura=Altura/100;
        Altura=Altura*Altura;
        System.out.println("El Indice de Masa Corporal es: "+ Peso/Altura );
        
        return Peso/Altura;
    }
  

 

    
    
    
    
    
}
