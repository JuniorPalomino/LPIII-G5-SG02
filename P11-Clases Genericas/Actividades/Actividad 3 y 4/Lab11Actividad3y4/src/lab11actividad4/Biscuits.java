
package lab11actividad4;

import java.util.Objects;

public class Biscuits extends Goodies{
    private String marca;

    public Biscuits(String marca, int id, String description, float price) {
        super(id, description, price);
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biscuits other = (Biscuits) obj;
        return Objects.equals(this.marca, other.marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  
    @Override
    public String toString() {
        return super.toString()+"Biscuits{" + "marca=" + marca + '}';
    }
    
}
