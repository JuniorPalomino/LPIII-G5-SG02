/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package informe03;

/**
 *
 * @author Alumno
 */
public class Bicycle {
    
    static int count;     //Variable de clase
    private String ownerName; //Variable de instancia 
    private float distance;     //Variable de instancia
    private String idBicy;     //Variable de instancia
    public Bicycle(String ownerName, int distance){
    
    this.ownerName= ownerName;
    this.distance= distance;
    counter();
    
    String tempId=String.valueOf(10000*count);
    
    this.idBicy = ownerName.substring(0,2)+tempId.substring(1);
  
    
    }

    public String getOwnerName() {  //Metodo de instancia
        return this.ownerName;
    }

    public float getDistance() {   //Metodo de instancia
        return this.distance;
    }
    public void distanceTraveled (int meters) {     //Metodo de instancia
        this.distance+=meters;
    }
    public static void counter(){
        count++;
    }
    
    public static Bicycle mostUsed(Bicycle x, Bicycle y){   //Metodo de clase
    
    if (x.distance> y.distance)
        return x;
    return y;
    }

    
    @Override
    public String toString(){               //Metodo de instancia
        String s=String.format("Bicycle:%s\n Owner: %s\n Distance in meters: %10.2f\n", this.idBicy,this.ownerName,this.distance);
        return s;
    }
    

  
    
    
    
    
    
}
