package lab4;

import java.math.*;

public class Ventas {

    public static void main(String[] args) {
        int ventas[][] = new int[5][4];
        int i, j, k;
        int total;
        //notas de las ventas del último mes
        for (i = 0; i < 30; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    total = (int) (Math.random() * 101);       //el valor total del producto vendido en el día es aleatorio, va desde 0 a 100
                    nota(ventas, k, j, total);
                }
            }
        }
        resultados(ventas);
    }

    //método que guarda los datos del vendedor, producto, valor vendido y los ingresa a la matriz bidimensional
    public static void nota(int matriz[][], int prod, int vend, int valorTotal) {
        matriz[prod][vend] += valorTotal;
    }

    public static void resultados(int matriz[][]) {
        System.out.println("=================VENDEDORES=================");
        System.out.println("\t\t1\t 2\t 3\t 4 \t TOTAL");
        System.out.println("--------------------------------------------");
        int sumaFila[] = new int[5];
        int sumaColumna[] = new int[4];

        for(int i = 0; i < matriz[i].length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                sumaColumna[i] += matriz[j][i];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Producto %d\t", i + 1);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d \t", matriz[i][j]);
                sumaFila[i] += matriz[i][j];
            }
            System.out.printf("| %d", sumaFila[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL \t");
        for (int k = 0; k < 4; k++) {
            System.out.printf("\t%d ", sumaColumna[k]);
        }
        System.out.println("");

    }
}
