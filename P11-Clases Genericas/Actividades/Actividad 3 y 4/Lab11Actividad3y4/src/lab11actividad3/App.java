package lab11actividad3;

public class App {

    public static void main(String[] args) throws IsFull, IsEmpty, ObjectNoExist {
        /*
        Bag<Integer> entero = new Bag<Integer>(2);
        entero.add(5);
        entero.add(2);
        entero.add(3);
        entero.remove(2);
        System.out.println(entero.toString());
        System.out.println(entero.getIxdex(10));
        System.out.println("====================");

        Bag<String> cadenas = new Bag<String>(3);
        cadenas.getObjects();
        System.out.println(cadenas.toString());
        System.out.println("====================");
*/
        Bag<Persona> personas = new Bag<Persona>(3);
        personas.add(new Persona("Josue", "Tacna", "965471223"));
        personas.remove(new Persona("Luis", "Lambramani", "921657403"));
        personas.add(new Persona("Pedro", "Yanahuara", "902631473"));
        personas.add(new Persona("Maria", "Camana", "995413680"));
        personas.remove(new Persona("Maria", "Camana", "995413680"));
        System.out.println(personas.toString());
        System.out.println("====================");
        
    }

}
