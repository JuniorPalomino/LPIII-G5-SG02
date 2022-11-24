
package lab11ejercicio1;

public class Biscuits extends Goodies{
    private String marca;

    public Biscuits(String marca, int id, String description, float price) {
        super(id, description, price);
        this.marca = marca;
    }

  
    @Override
    public String toString() {
        return super.toString()+"Biscuits{" + "marca=" + marca + '}';
    }
    
}
