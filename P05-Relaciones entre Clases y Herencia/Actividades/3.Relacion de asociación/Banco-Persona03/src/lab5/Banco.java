package lab5;

public class Banco {

    private String nombre;
    private Persona clientes[];

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCliente(Persona persona) {

        for (int i = 0; i < clientes.length; i++) {
            if (!buscarCliente(persona)) {
                {
                    if (clientes[i] == null) {
                        clientes[i] = persona;
                        break;
                    }
                }
            }
        }

    }

    public void darBajarCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].equals(persona)) {
                    clientes[i] = null;
                    break;
                }
            }
        }
    }

    public boolean buscarCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].equals(persona)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void clientesTipo(char tipo) {

    }

    @Override
    public String toString() {
        String listaClientes = "";
        for (Persona cliente : clientes) {
            if (cliente != null) {
                listaClientes += cliente;
                listaClientes += "\n";
            }
        }
        return listaClientes;
    }

}
