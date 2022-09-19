package lab5ejercicio3;

public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private String nroCuenta = "";
    
    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(id);
        nroCuenta += cuenta.getTipoCliente();
        switch (cuenta.getTipoCliente()) {
            case 'C':
                nroCuenta += "1000";
                break;
            case 'B':
                nroCuenta += "5000";
                break;
            default:
                nroCuenta += "8000";
                break;
        }
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
        nroCuenta="";
        nroCuenta += cuenta.getTipoCliente();
        switch (cuenta.getTipoCliente()) {
            case 'C':
                nroCuenta += "1000";
                break;
            case 'B':
                nroCuenta += "5000";
                break;
            default:
                nroCuenta += "8000";
                break;
        }
    }
    
    public String getNroCuenta() {
        return nroCuenta;
    }
    
    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void depositar(double n) {
        cuenta.depositar(n);
    }

    public void retirar(double n) {
        cuenta.retirar(n);
    }

    @Override
    public String toString() {
        String s = "";
        s += "Cliente\t: " + id + "\n";
        s += "Tipo\t: " + cuenta.getTipoCliente() + "\n";
        s += "Nombres\t: " + nombre + " " + apellido + "\n";
        s += "No Cuenta: " + nroCuenta + "\t" + "Saldo: " + cuenta.getSaldo();
        return s;
    }
    
}
