package lab10actividad1;

public class Minimo {

    public static void main(String[] args) {
        //Minimo de datos de tipo Entero
        System.out.printf("Minimo de %d, %d, %d y %d es %d%n%n", 
                3, 4, 5, 6, minimo(3, 4, 5, 6));
        //Minimo de datos de tipo Double
        System.out.printf("Minimo de %.2f, %.2f, %.2f y %.2f es %.2f%n%n", 
                3.14, 2.478, 8.062, 10.281, minimo(3.14, 2.478, 8.062, 10.281));
        //Minimo de datos de tipo String
        System.out.printf("Minimo de %s, %s, %s and %s es %s%n%n", 
                "pera", "zanahoria", "uva", "manzana", minimo("pera", "zanahoria", "uva", "manzana"));

    }

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;
        if (b.compareTo(a) < 0) {
            min = b;
        }
        if (c.compareTo(b) < 0) {
            min = c;
        }
        if (d.compareTo(c) < 0) {
            min = d;
        }
        return min;
    }
}
