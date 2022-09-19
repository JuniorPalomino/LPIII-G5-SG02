 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asalariado04;

/**
 *
 * @author Alumno
 */
public class EmpleadoDistribucion extends Asalariado {
    
    private String region;

    public EmpleadoDistribucion(String Nombre, long dni, int diasVacaciones, double Salario, String region) {
        super(Nombre, dni, diasVacaciones, Salario);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
      
    public double CalNominaDistribucion(double salario){
        
        return salario+(salario*10/100);
    }

    @Override
    
    public String toString() {
        return "Empleado Distribucion" + "\n Nombre=" + getNombre() + "\n dni=" + getDni() + "\n Vacaciones=" + getDiasVacaciones() + "\n Salario=" + CalNominaDistribucion(getSalario()) + "\n region=" + region +'\n';
    }
    
}
