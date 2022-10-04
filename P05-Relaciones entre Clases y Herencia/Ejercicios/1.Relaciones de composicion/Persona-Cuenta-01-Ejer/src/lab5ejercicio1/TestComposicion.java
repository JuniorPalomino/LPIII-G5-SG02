package lab5ejercicio1;

public class TestComposicion {

    public static void main(String[] args) {
        Persona p1 = new Persona(1234, "Bill", "Gates");
        Persona p2= new Persona(6923,"Linus","Torvals");
        Cuenta c = new Cuenta(5687, 7500, 'E');
        c.setPersona(p1);
        c.retirar(90000);
        System.out.println(c);
        System.out.println(p2);
    }
}
