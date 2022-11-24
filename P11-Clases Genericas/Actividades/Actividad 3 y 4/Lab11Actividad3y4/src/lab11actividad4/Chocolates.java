
package lab11actividad4;

import java.util.Objects;


public class Chocolates extends Goodies{
    private int porcentajeCacao;
    private String tipo;

    public Chocolates(int porcentajeCacao, String tipo, int id, String description, float price) {
        super(id, description, price);
        this.porcentajeCacao = porcentajeCacao;
        this.tipo = tipo;
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
        final Chocolates other = (Chocolates) obj;
        if (this.porcentajeCacao != other.porcentajeCacao) {
            return false;
        }
        return Objects.equals(this.tipo, other.tipo);
    }

    public int getPorcentajeCacao() {
        return porcentajeCacao;
    }

    public void setPorcentajeCacao(int porcentajeCacao) {
        this.porcentajeCacao = porcentajeCacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Chocolates{" + "porcentajeCacao=" + porcentajeCacao + ", tipo=" + tipo + '}';
    }
    
}
