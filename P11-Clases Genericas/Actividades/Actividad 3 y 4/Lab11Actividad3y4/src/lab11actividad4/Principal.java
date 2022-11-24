
package lab11actividad4;

import lab11actividad3.*;

public class Principal {

    public static void main(String[] args) throws IsFull,IsEmpty,ObjectNoExist{
        try {
            Bag <Biscuits> galletas=new Bag<Biscuits>(2);
            galletas.add(new Biscuits("Oreo", 25, "Galleta oreo",4));
            galletas.add(new Biscuits("Costa", 4, "Galleta costa",3));
            galletas.add(new Biscuits("Nike", 10, "Galleta nike",3.5f));    //excepcion isFull
            Bag <Chocolates> chocolates=new Bag<Chocolates>(3);
            chocolates.add(new Chocolates(80,"Negro",1,"chocolate negro",8));
            chocolates.add(new Chocolates(60,"Con leche",2,"chocolate con leche",4));
            chocolates.remove(new Chocolates(80,"Negro",1,"chocolate negro",8));    
            System.out.println(chocolates.toString());
            Bag <Soda> sodas=new Bag<Soda>(3);
            sodas.getObjects();     //excepcion IsEmpty
            sodas.add(new Soda(600, "Coca cola", 6, "Gaseosa coca cola de 600ml", 3));
            sodas.add(new Soda(500, "KR", 4, "Gaseosa KR de 500ml", 2));
            sodas.remove(new Soda(300, "FANTA", 5, "Gaseosa Fanta de 300ml", 2));   //excepcion ObjectNoExist
            System.out.println(galletas.toString());
            System.out.println(chocolates.toString());
            System.out.println(sodas.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

}
