package lab11actividad4;

public class Sweet extends Biscuits {

    private int porcentajeAzucar;

    public Sweet(int porcentajeAzucar, String marca, int id, String description, float price) {
        super(marca, id, description, price);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(int porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.porcentajeAzucar;
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
        final Sweet other = (Sweet) obj;
        return this.porcentajeAzucar == other.porcentajeAzucar;
    }

    
    @Override
    public String toString() {
        return super.toString() + "Sweet{" + "porcentajeAzucar=" + porcentajeAzucar + '}';
    }

}
