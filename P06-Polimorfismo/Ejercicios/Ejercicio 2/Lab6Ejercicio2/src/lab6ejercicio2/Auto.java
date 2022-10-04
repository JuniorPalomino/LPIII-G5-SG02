package lab6ejercicio2;

public class Auto implements ImpactoEcológico {

    private double cantdGasolinax100km;
    private double kilometraje;

    public Auto(double cantdGasolinax100km, double kilometraje) {
        this.cantdGasolinax100km = cantdGasolinax100km;
        this.kilometraje = kilometraje;
    }

    private double actividad() {
        return (kilometraje * cantdGasolinax100km) / 100;
    }

    public double getCantdGasolinax100km() {
        return cantdGasolinax100km;
    }

    public void setCantdGasolinax100km(double cantdGasolinax100km) {
        this.cantdGasolinax100km = cantdGasolinax100km;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return actividad() * 0.3;
    }

    @Override
    public String toString() {
        return "Auto\nCantidad de Gasolina x 100km:\t" + cantdGasolinax100km + "\nKilometraje:\t\t\t" + kilometraje+" km";
    }

}
