
package lab11actividad4;

import java.util.Objects;

public class Goodies {
    int id;
    String description;
    float price;  

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Float.floatToIntBits(this.price);
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
        final Goodies other = (Goodies) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Godies{" + "id=" + id + ", description=" + description + ", price=" + price + '}';
    }
    
}
