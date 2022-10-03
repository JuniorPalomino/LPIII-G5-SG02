
package lab6ejercicio2;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<ImpactoEcológico> arrImpactoEc=new ArrayList<ImpactoEcológico> (3);
        arrImpactoEc.add(new Auto(10, 60000));
        arrImpactoEc.add(new Bicicleta(3, 10));
        arrImpactoEc.add(new Edificio(10, 350, 6));
        
        //IMPRIMIENDO LOS DATOS DE MANERA POLIMORFICA
        for(ImpactoEcológico impec : arrImpactoEc)
        {
            System.out.println(impec);
            System.out.println("Impacto Ecologico:\t"+impec.obtenerImpactoEcologico());
            System.out.println("-------------------------");
        }
    }
}
