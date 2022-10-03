/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jerarquiafigura_ejer01;

/**
 *
 * @author ADMIN
 */
public class JerarquiaFigura_Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Circulo ObjCirculo=new Circulo(12,"Circulo","Bidimensional");
    Cuadrado ObjCuadrado=new Cuadrado(4,"Cuadrado","Bidimensional");
    Triangulo ObjTriangulo=new Triangulo(3,5,"Triangulo","Bidimensional");
    Tetraedro ObjTetraedro=new Tetraedro(4.6,12,"Tetraedro","Tridimensional");
    Cubo ObjCubo=new Cubo(9,"Cubo","Tridimensional");
    Esfera ObjEsfera=new Esfera(7,"Esfera","Tridimensional");
   
    
    Figura[] n= new Figura[6];
    
    n[0]=ObjCirculo;
    n[1]=ObjCuadrado;
    n[2]=ObjTriangulo;
    n[3]=ObjTetraedro;
    n[4]=ObjCubo;
    n[5]=ObjEsfera;
    
    
    for(Figura FigPolimorfico : n){
        
        System.out.println(FigPolimorfico.toString());
        
        if(FigPolimorfico instanceof FiguraTridimensional){
            System.out.println("Volumen: "+ ((FiguraTridimensional) FigPolimorfico).getNombre()+":"+((FiguraTridimensional) FigPolimorfico).ObtenerVolumen());
        
        }
        
    }
    
    
    
    
    
  }
    
    
    
    
    
  
    
}
