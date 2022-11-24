
package lab11actividad4;

public class Soda extends Biscuits{
    private int cantidad;    //ml

    public Soda(int cantidad, String marca, int id, String description, float price) {
        super(marca, id, description, price);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.cantidad;
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
        final Soda other = (Soda) obj;
        return this.cantidad == other.cantidad;
    }

    

    @Override
    public String toString() {
        return super.toString()+"Soda{" + "cantidad=" + cantidad + '}';
    }
    
}
