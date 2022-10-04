package lab5ejercicio2;

public class Automovil {

    private String Placa;
    private int Puertas;
    private String Marca;
    private String Modelo;
    private Motor motor;

    public Automovil(String Placa, int Puertas, String Marca, String Modelo) {
        this.Placa = Placa;
        this.Puertas = Puertas;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return Placa;
    }

    public int getPuertas() {
        return Puertas;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String toString() {
        String cadena = "";
        if (motor != null) {
            cadena = "Automovil con motor \n";
            cadena += "Placa\t\t: " + Placa + "\n";
            cadena += "No. Puertas\t: " + Puertas + "\n";
            cadena += "Marca\t\t: " + Marca + "\n";
            cadena += "Modelo\t\t: " + Modelo + "\n";
            cadena += motor;
            
        } else {
            cadena = "Automovil sin motor \n";
            cadena += "Placa\t\t: " + Placa + "\n";
            cadena += "No. Puertas\t: " + Puertas + "\n";
            cadena += "Marca\t\t: " + Marca + "\n";
            cadena += "Modelo\t\t: " + Modelo;
            
        }
        return cadena;
    }
}
