package lab6ejercicio2;

public class Bicicleta implements ImpactoEcológico {

    private double recorridoPromxDia;          //En km
    private int tiempoDeUso;                   //En años

    public Bicicleta(double recorridoPromxDia, int tiempoDeUso) {
        this.recorridoPromxDia = recorridoPromxDia;
        this.tiempoDeUso = tiempoDeUso;
    }

    private double actividad() {
        return (recorridoPromxDia*365)*tiempoDeUso;
    }
    public double getRecorridoPromxDia() {
        return recorridoPromxDia;
    }

    public void setRecorridoPromxDia(double recorridoPromxDia) {
        this.recorridoPromxDia = recorridoPromxDia;
    }

    public int getTiempoDeUso() {
        return tiempoDeUso;
    }

    public void setTiempoDeUso(int tiempoDeUso) {
        this.tiempoDeUso = tiempoDeUso;
    }

    

    @Override
    public double obtenerImpactoEcologico() {
        return actividad() * 0.05;
    }

    @Override
    public String toString() {
        return "Bicicleta\nTiempo De Uso:\t\t\t" + tiempoDeUso + " anios\nRecorrido Promedio x Dia:\t" + recorridoPromxDia+" km";
    }
    
}
