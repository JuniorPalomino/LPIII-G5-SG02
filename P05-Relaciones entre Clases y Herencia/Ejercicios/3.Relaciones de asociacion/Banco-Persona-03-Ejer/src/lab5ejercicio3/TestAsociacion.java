
package lab5ejercicio3;

public class TestAsociacion {
    public static void main(String[] args) {

        Banco bcp = new Banco("BCP");
        
        Persona p1 = new Persona(1848, "steve", "jobs");
        Persona p2 = new Persona(8713, "Bill", "Gates");
        Persona p3 = new Persona(9108, "Elon", "Musk");
        Persona p4 = new Persona(3694, "Jackie", "Chan");
        Persona p5 = new Persona(1028, "Leo", "Messi");
        Persona p6 = new Persona(7036, "Will", "Smith");
        Persona p7 = new Persona(5470, "Ariana", "Grande");
        Persona p8 = new Persona(3029, "Selena", "Gomez");
        Persona p9 = new Persona(1960, "Scarlett", "Johansson");
        
        Cuenta c1 = new Cuenta(5687, 7500, 'B');
        Cuenta c2 = new Cuenta(6384, 1200, 'B');
        Cuenta c3 = new Cuenta(1023, 90000, 'E');
        Cuenta c4 = new Cuenta(3610, 156240, 'E');
        Cuenta c5 = new Cuenta(7056, 789000, 'E');
        p9.setCuenta(c5);
        p8.setCuenta(c4);
        p7.setCuenta(c1);
        p1.setCuenta(c2);
        p3.setCuenta(c3);
        
        bcp.agregarCliente(p1);
        bcp.agregarCliente(p2);
        bcp.agregarCliente(p3);
        bcp.agregarCliente(p4);
        bcp.agregarCliente(p5);
        bcp.agregarCliente(p6);
        bcp.agregarCliente(p7);
        bcp.agregarCliente(p8);
        bcp.agregarCliente(p9);
        
        bcp.darBajarCliente(p3);
        bcp.darBajarCliente(p6);
        
        bcp.clienteTipo();
    }
}
