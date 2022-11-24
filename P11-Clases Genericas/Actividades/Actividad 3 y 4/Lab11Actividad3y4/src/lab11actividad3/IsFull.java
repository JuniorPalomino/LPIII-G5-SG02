package lab11actividad3;

public class IsFull extends Exception {


    public IsFull(String mensaje) {

        super(mensaje);

    }

    public void mensaje() {

        System.out.println("Arreglo lleno");

    }

}
