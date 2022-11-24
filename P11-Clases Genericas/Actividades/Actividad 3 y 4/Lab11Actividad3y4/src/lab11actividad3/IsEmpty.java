
package lab11actividad3;

public class IsEmpty extends Exception{
    public IsEmpty(String mensaje) {

        super(mensaje);

    }

    public void mensaje() {

        System.out.println("Arreglo vacio");

    }
}
