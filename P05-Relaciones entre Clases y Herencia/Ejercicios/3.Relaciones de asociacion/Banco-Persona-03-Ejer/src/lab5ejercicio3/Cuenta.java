package lab5ejercicio3;

import java.util.Scanner;

public class Cuenta {

    private int numero;
    private double saldo;
    private char tipoCliente;
    private Persona persona;
    private String nroCuenta = "";

    public Cuenta(int numero, double saldo, char tipo) {
        this.numero = numero;
        if (saldo < 50) {
            Scanner sc = new Scanner(System.in);

            while (saldo < 50) {
                System.out.println("Imposible tener una cuenta con un saldo menor a 50, ingrese un nuevo saldo");
                saldo = sc.nextDouble();
            }
            sc.close();
        }
        this.saldo = saldo;
        if (tipo != 'C' && tipo != 'B' && tipo != 'E') {
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("Ingrese un nuevo tipo: C, B o E");
                tipoCliente = sc.next().charAt(0);
            } while (tipo != 'C' && tipo != 'B' && tipo != 'E');
            sc.close();
        }
        this.tipoCliente = tipo;
        nroCuenta += this.tipoCliente;
        switch (tipo) {
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

    public Cuenta(int numero, double saldo) {
        this(numero, saldo, 'C');
    }

    public Cuenta(int numero) {
        this(numero, 50, 'C');
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona per) {
        this.persona = per;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public char getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void depositar(double d) {
        saldo += d;
    }

    public void retirar(double d) {
        if (saldo - d < 50) {
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Imposible tener una cuenta con un saldo menor a 50, ingrese un nuevo monto para retirar ");
                d = sc.nextDouble();
            } while (saldo - d < 50);
            sc.close();
        }

        this.saldo -= d;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Cliente\t: " + persona.getId() + "\n";
        s += "Tipo\t: " + tipoCliente + "\n";
        s += "Nombres\t: " + persona.getNombre() + " " + persona.getApellido() + "\n";
        s += "No Cuenta: " + nroCuenta + "\t" + "Saldo: " + saldo;
        return s;
    }

}
