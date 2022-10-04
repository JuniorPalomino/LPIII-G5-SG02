package lab6ejercicio2;

public class Edificio implements ImpactoEcológico {

    private int cantidadDePisos;
    private double kwhxPisoxAnio;
    private int aniosDelEdificio;

    public Edificio(int cantidadDePisos, double kwhxPisoxAnio, int aniosDelEdificio) {
        this.cantidadDePisos = cantidadDePisos;
        this.kwhxPisoxAnio = kwhxPisoxAnio;
        this.aniosDelEdificio = aniosDelEdificio;
    }

    private double actividad() {
        return (cantidadDePisos * kwhxPisoxAnio * aniosDelEdificio);
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(int cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public double getKwhxPisoxAnio() {
        return kwhxPisoxAnio;
    }

    public void setKwhxPisoxAnio(double kwhxPisoxAnio) {
        this.kwhxPisoxAnio = kwhxPisoxAnio;
    }

    public int getAniosDelEdificio() {
        return aniosDelEdificio;
    }

    public void setAniosDelEdificio(int aniosDelEdificio) {
        this.aniosDelEdificio = aniosDelEdificio;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return actividad() * 0.5;
    }

    @Override
    public String toString() {
        return "Edificio\nCantidad De Pisos:\t" + cantidadDePisos + "\nKwh x Piso x Anio:\t" + kwhxPisoxAnio + "\nAnios Del Edificio:\t" + aniosDelEdificio+" anios";
    }

}
