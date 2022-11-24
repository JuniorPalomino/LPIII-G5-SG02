package lab11actividad3;

public class ObjectNoExist extends Exception {

    public ObjectNoExist(String mensaje) {

        super(mensaje);

    }

    public void mensaje() {

        System.out.println("No existe");

    }
}
