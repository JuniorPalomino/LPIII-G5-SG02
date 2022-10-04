/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perfilmedico;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class PerfilMedico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
        Scanner sc=new Scanner(System.in);
        String _nombre;
        String _apellido;
        String _sexo=" ";
        double _altura;
        double _peso;
        int _anio,_mes,_dia;
        
        int CalcuEdad;
        int opc=0;
        System.out.println("Ingrese el Nombres: ");
        _nombre=sc.next();
        System.out.println("Ingrese el Apellidos: ");
        _apellido=sc.next();
        
        while(opc<1 || opc>2){                              //Ingreso de Sexo
        System.out.println("Secione el Sexo: ");
        System.out.println("1.Masculino.");
        System.out.println("2.Femenino");
        opc=sc.nextInt();
        if (opc==1){
           _sexo="Maculino"; 
           }
        if(opc==2){
            _sexo="Femenino";
            }
        }
        
        do{                                                      //Ingreso Altura
        System.out.println("Ingrese la Altura(Centimetros): ");
        _altura=sc.nextDouble();
         }while(_altura<0 || _altura>300);
        do{
        System.out.println("Ingrese el Peso(Kilogramos): ");
        _peso=sc.nextDouble();
         }while(_altura<1);
        
        System.out.println("Ingrese su Fecha de Nacimiento ");
       do{ 
        System.out.println("Ingrese el Año : ");
        _anio=sc.nextInt();
       }while(_anio<1900 || _anio>2022);
       do{
        System.out.println("Ingrese el Mes(numero) : ");
        _mes=sc.nextInt();
        }while(_mes<1 || _mes>12);
       do{
        System.out.println("Ingrese el Día(numero) : ");
        _dia=sc.nextInt();
        }while(_dia<1 || _dia>30);
        
        PerfilMedi P01 =new PerfilMedi(_nombre,_apellido,_sexo,_altura,_peso,_anio,_mes,_dia);
        
        P01.toString();
        
        System.out.println(P01.toString());
        
        System.out.println("PERFIL MEDICO ");
        System.out.println("=========================== ");
        System.out.println("EDAD:");
        CalcuEdad=P01.CalcularEdad(_anio, _mes, _dia);
        System.out.println("INDICE DE MASA MUSCULAR: ");
        P01.FMC(CalcuEdad);
        System.out.println("FRECUENCIA CARDIACA MAXIMA: ");
        P01.IMC(_peso, _altura);
      
        
       
    }
    
}
