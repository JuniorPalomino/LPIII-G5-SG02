package lab5ejercicio2;

public class TestAgregacion {

    public static void main(String[] args) {
        Automovil A1 = new Automovil("A7N5", 5, "Toyota", "Hylux");

        Automovil A2 = new Automovil("NJ62", 3, "Chevrolet", "Camaro");

        Automovil A3 = new Automovil("SH23", 5, "Ford", "Focus");

        Automovil A4 = new Automovil("LJ12", 3, "Aston Martin", "DB11");
        
        Motor N1500 = new Motor(50, 1000);
        Motor N3000 = new Motor(400, 3000);

        A1.setMotor(N1500);
        A2.setMotor(N3000);

        System.out.println(A1);
        System.out.println("-------------------------------");
        System.out.println(A2);
        System.out.println("-------------------------------");
        System.out.println(A3);
        System.out.println("-------------------------------");
        System.out.println(A4);

    }
}
