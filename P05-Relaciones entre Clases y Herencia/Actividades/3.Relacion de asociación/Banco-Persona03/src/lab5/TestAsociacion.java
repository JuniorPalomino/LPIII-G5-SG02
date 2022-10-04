package lab5;

public class TestAsociacion {

    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        Persona p1 = new Persona(1848, "steve", "jobs");
        Persona p2 = new Persona(8713, "Bill", "Gates");
        Persona p3 = new Persona(8713, "Elon", "Musk");
        bcp.agregarCliente(p1);
        bcp.agregarCliente(p2);
        bcp.agregarCliente(p3);

        bcp.darBajarCliente(p3);
        System.out.println(bcp);
        System.out.println(bcp.buscarCliente(p3));
        bbva.agregarCliente(p1);
        bbva.agregarCliente(p2);

        System.out.println(bbva);

    }
}
