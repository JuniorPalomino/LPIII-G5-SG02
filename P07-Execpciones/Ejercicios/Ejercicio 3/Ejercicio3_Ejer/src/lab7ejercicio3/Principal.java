package lab7ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) throws IOException {

        InputStream is;
        try {
            is = new FileInputStream("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Lab7Ejercicio3\\src\\lab7ejercicio3/texto.txt");
            LeerEntrada obj = new LeerEntrada(is);
            procesar(obj);

        } catch (SalidaExcep sal) {
            System.out.println("Excepcion de Salida, Fin del programa");
        }

    }

    public static void procesar(LeerEntrada leer) throws VocalExcep, BlancoExcep, SalidaExcep, NumeroExcep, IOException {

        ArrayList<Character> aux = new ArrayList<Character>();
        for (int i = 0; i < 1000; i++) {
            aux.add(leer.getChar());

            if (aux.get(i) == '\n') {
                break;
            }
        }
        for (int i = 0; i < aux.size(); i++) {
            try {
                switch (aux.get(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        throw new VocalExcep("Nuexa Excepcion de vocal");
                    case ' ':
                        throw new BlancoExcep("Nueva Excepcion de blanco");
                    case '\n':
                        throw new SalidaExcep("Nueva Excepcion de salida");
                    default:
                        break;
                }
                if (aux.get(i) >= '0' && aux.get(i) <= '9') {
                    throw new NumeroExcep("Nueva Excepcion de numero");
                }
                
            } catch (VocalExcep voc) {
                System.out.println("Excepcion de Vocal: " + aux.get(i));
            } catch (BlancoExcep blanco) {
                System.out.println("Excepcion de Blanco ");
            } catch (NumeroExcep num) {
                System.out.println("Excepcion de Numero: " + aux.get(i));
            }

        }

    }

}
