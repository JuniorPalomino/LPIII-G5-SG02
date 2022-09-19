package lab5ejercicio2;

public class Motor {

    private int numMotor;
    private int Revoluciones;

    public Motor(int numMotor, int Revoluciones) {
        this.numMotor = numMotor;
        this.Revoluciones = Revoluciones;
    }

    public int getNumMotor() {
        return numMotor;
    }

    public int getRevoluciones() {
        return Revoluciones;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public void setRevoluciones(int Revoluciones) {
        this.Revoluciones = Revoluciones;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "No. Motor\t: " + numMotor + "\n";
        cadena += "RPM\t\t: " + Revoluciones;
        return cadena;
    }
}
