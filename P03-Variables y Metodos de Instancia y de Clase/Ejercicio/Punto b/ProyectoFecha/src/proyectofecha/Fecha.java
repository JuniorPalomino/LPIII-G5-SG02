/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofecha;
import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Fecha {
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        valida();
    }

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.year = 1900;
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el anio: ");
        year = sc.nextInt();
        valida();
    }

    public boolean bisiesto() {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int diaMes(int a) {
        switch (a) {
            case 1,3,5,7,8,10,12:
                return 31;
            case 2:
                if (bisiesto()) {
                    return 29;
                }
                return 28;
            case 4,6,9,11:
                return 30;
        }
        return 0;
    }

    private void valida() {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (year < 1900 || year > 2050) {
            year = 1900;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void corta() {
        System.out.println(dia + "-" + mes + "-" + year);
    }

    public int diasTranscurridos() {
        Fecha f = new Fecha();
        int diasTotales = 0;

        diasTotales = dia - f.dia;
        while (mes > f.mes) {
            diasTotales += f.diaMes(f.mes);
            f.mes++;
        }
        while (year > f.year) {
            f.year++;
            if (f.bisiesto()) {
                diasTotales += 366;
            } else {
                diasTotales += 365;
            }

        }
        if (f.bisiesto()) {
            diasTotales -= 1;
        }
        return diasTotales;

    }

    public int diaSemana() {
        int diaSem = diasTranscurridos() % 7;
        diaSem = (diaSem + 1) % 7;
        return diaSem;

    }

    public void larga() {
        String nombreMes="";
        String nombrediaSem="";
        switch (mes) {
            case 1: nombreMes="Enero"; break;
            case 2: nombreMes="Febrero"; break;
            case 3: nombreMes="Marzo"; break;
            case 4: nombreMes="Abril"; break;
            case 5: nombreMes="Mayo"; break;
            case 6: nombreMes="Junio"; break;
            case 7: nombreMes="Julio"; break;
            case 8: nombreMes="Agosto"; break;
            case 9: nombreMes="Septiembre"; break;
            case 10: nombreMes="Octubre"; break;
            case 11: nombreMes="Noviembre"; break;
            case 12: nombreMes="Diciembre"; break;
        }
        switch (diaSemana()) {
            case 0: nombrediaSem="Domingo"; break;
            case 1: nombrediaSem="Lunes"; break;
            case 2: nombrediaSem="Martes"; break;
            case 3: nombrediaSem="Miercoles"; break;
            case 4: nombrediaSem="Jueves"; break;
            case 5: nombrediaSem="Viernes"; break;
            case 6: nombrediaSem="Sabado"; break;
            
        }
        System.out.println(nombrediaSem+" "+dia+" de "+nombreMes+" de "+year);
    }
    public void fechaTras(long d) {
        dia = 1;
        mes = 1;
        year = 1900;
        while (d > 0) {
            siguiente();
            d--;
        }
    }

    public int diasEntre(Fecha f1) {
        int dias1 = diasTranscurridos();      //total de dias del origen a la fecha
        int dias2 = f1.diasTranscurridos();   //total de dias del origen al parametro
        return dias2 - dias1;
    }

    public void siguiente() {
        if (dia == diaMes(mes)) {
            dia = 1;
            if (mes == 12) {
                year++;
                mes = 1;
            } else {
                mes++;
            }
        } else {
            dia++;
        }
    }

    public void anterior() {
        if (dia == 1) {
            if (mes == 1) {
                year--;
                mes = 12;
                dia = diaMes(1);
            } else {
                dia = diaMes(mes - 1);
                mes--;
            }
        } else {
            dia--;
        }
    }

    public void fechaFutura(long d) {
        while (d > 0) {
            siguiente();
            d--;
        }
    }

    public Fecha copia() {
        return new Fecha(dia, mes, year);
    }

    public boolean igualQue(Fecha f1, Fecha f2) {
        if (f1.dia == f2.dia && f1.mes == f2.mes && f1.year == f2.year) {
            return true;
        }
        return false;
    }

    public boolean menorQue(Fecha f1, Fecha f2) {
        if (f1.diasTranscurridos() < f2.diasTranscurridos()) {
            return true;
        }
        return false;
    }

    public boolean mayorQue(Fecha f1, Fecha f2) {
        if (f1.diasTranscurridos() > f2.diasTranscurridos()) {
            return true;
        }
        return false;
    }
}
