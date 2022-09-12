/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evalucioncrediticiaejercicio02;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class EvalucionCrediticiaEjercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        ArrayList<EvalucionCre> personas = new ArrayList<>();

        int sexo,SNtrabajo,sueldo;
        int n=8; //Personas en el for

        for (int i = 0; i < 8; i++) {
            System.out.println("---------------PERSONA "+ i +"------------------");
            System.out.println("------------------------------------------------");
            do{
                System.out.println("INGRESE SU SEXO (1)=MASCULINO, (2)=FEMENINO : ");
                sexo = sn.nextInt();
            }while(sexo!=1 && sexo!=2 );
            do{
                System.out.println("INGRESE (1)= SÍ TRABAJA, (2)= NO TRABAJA : ");
                SNtrabajo = sn.nextInt();
             }while(SNtrabajo!=1 && SNtrabajo!=2 );
            if (SNtrabajo == 1) {
                sueldo = (int) (Math.random() * 3000 + 950);
            } else {
                sueldo = 0;
            }
            personas.add(new EvalucionCre(sexo, SNtrabajo, sueldo));
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            if (personas.get(i).getSexo() == 1) {
                suma++;
            }
        }
        System.out.println("PORCENTAJE DE HOMBRE(TENGAN O NO TRABAJO),ES: %" + (suma / n) * 100);

        suma = 0;
        for (int i = 0; i < n; i++) {
            if (personas.get(i).getSexo() == 1) {
                suma++;
            }
        }
        System.out.println("PORCENTAJE DE MUJERES(TENGAN O NO TRABAJO),ES: %" + (suma / n) * 100);

        suma = 0;
        for (int i = 0; i < n; i++) {
            if (personas.get(i).getSexo() == 1) {
                if (personas.get(i).getTrabajo() == 1) {
                    suma++;
                }
            }
        }
        System.out.println("PORCENTAJE DE HOMBRE QUE TRABAJAN, ES: %" + (suma / n) * 100);

        suma = 0;
        for (int i = 0; i < n; i++) {
            if (personas.get(i).getSexo() == 1) {
                if (personas.get(i).getTrabajo() == 1) {
                    suma++;
                }
            }
        }
        System.out.println("PORCENTAJE DE MUJERES QUE TRABAJAN, ES: %" + (suma / n) * 100);

        double contador = 0;
        suma = 0;
        for (int i = 0; i < n; i++) {
            if (personas.get(i).getSexo() == 1) {
                if (personas.get(i).getTrabajo() == 1) {
                    suma += personas.get(i).getSueldo();
                    contador++;
                }
            }
        }
        System.out.println("EL SUELDO PROMEDIO DE LOS HOMBRES QUE TRABAJANES, ES: %" + (suma / contador));

        suma = 0;
        for (int i = 0; i < n; i++) {
            if (personas.get(i).getSexo() == 1) {
                if (personas.get(i).getTrabajo() == 1) {
                    suma += personas.get(i).getSueldo();
                    contador++;
                }
            }
        }
        System.out.println("EL SUELDO PROMEDIO DE LAS MUJERES QUE TRABAJAN, ES: % " + (suma / contador));

    }

}
