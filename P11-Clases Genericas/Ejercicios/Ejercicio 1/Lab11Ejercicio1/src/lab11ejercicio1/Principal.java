
package lab11ejercicio1;

public class Principal {

    public static void main(String[] args) throws IsFull {

        CandyBags<Chocolates> obj1 = new CandyBags<Chocolates>(4);
        obj1.add(new Chocolates(75, "negro", 1, "Chocolate negro", 20));
        obj1.add(new Chocolates(60, "con leche", 2, "Chocolate con leche", 12));
        obj1.add(new Chocolates(50, "blanco", 3, "Chocolate blanco", 8));
        obj1.add(new Chocolates(55, "con pasas", 4, "Chocolate con pasas", 10));
        System.out.println(obj1.cheapset());
        System.out.println("===================================");
        CandyBags<Biscuits> obj2 = new CandyBags<Biscuits>(2);
        obj2.add(new Biscuits("Oreo", 4, "sabor chocolate", 4));
        obj2.add(new Biscuits("Oreo", 6, "sabor vainilla", 3.5f));
        System.out.println(obj2.cheapset());
        System.out.println("===================================");
        System.out.println(obj1.mostExpensive(2).toString());
        System.out.println("===================================");
        
    }

}
