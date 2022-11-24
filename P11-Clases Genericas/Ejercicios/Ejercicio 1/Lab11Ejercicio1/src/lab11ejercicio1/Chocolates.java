
package lab11ejercicio1;


public class Chocolates extends Goodies{
    private int porcentajeCacao;
    private String tipo;

    public Chocolates(int porcentajeCacao, String tipo, int id, String description, float price) {
        super(id, description, price);
        this.porcentajeCacao = porcentajeCacao;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Chocolates{" + "porcentajeCacao=" + porcentajeCacao + ", tipo=" + tipo + '}';
    }
    
}
