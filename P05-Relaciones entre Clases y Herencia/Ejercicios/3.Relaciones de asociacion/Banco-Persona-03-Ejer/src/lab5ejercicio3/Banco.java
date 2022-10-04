package lab5ejercicio3;
import java.util.ArrayList;
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
                
                if (clientes[i] == null) {
                clientes[i] = persona;
                break;
                }
                
            }
        }

    }

    public Persona darBajarCliente(Persona persona) {
        int c=0;
        Persona aux=new Persona(0,"","");
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].equals(persona)) {
                    aux=clientes[i];
                    clientes[i] = null;
                    c=i;
                    for(int j=clientes.length-1;j>i &&clientes[j]!=null;j--)
                    {
                        
                        clientes[i]=clientes[j];
                        break;
                    }
                    break;
                }
            }
        }
        return aux;
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
    
    public void clienteTipo()
    {
        ArrayList <Persona> tipoC=new ArrayList<>();
        ArrayList <Persona> tipoB=new ArrayList<>();
        ArrayList <Persona> tipoE=new ArrayList<>();
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                switch (clientes[i].getCuenta().getTipoCliente()) {
                    case 'C':
                        tipoC.add(clientes[i]);
                        break;
                    case 'B':
                        tipoB.add(clientes[i]);
                        break;
                    default:
                        tipoE.add(clientes[i]);
                        break;
                }
            }
        }
        System.out.println("Lista de Clientes de tipo C");
        for(int i=0;i<tipoC.size();i++)
        {
            System.out.println(tipoC.get(i));
        }
        System.out.println("------------------------------");
        System.out.println("Lista de Clientes de tipo B");
        for(int j=0;j<tipoB.size();j++)
        {
            System.out.println(tipoB.get(j));
        }
        System.out.println("------------------------------");
        System.out.println("Lista de Clientes de tipo E");
        for(int k=0;k<tipoE.size();k++)
        {
            System.out.println(tipoE.get(k));
        }
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
