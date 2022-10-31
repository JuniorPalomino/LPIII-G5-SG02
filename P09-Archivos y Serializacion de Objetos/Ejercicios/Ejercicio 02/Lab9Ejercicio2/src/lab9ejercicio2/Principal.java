package lab9ejercicio2;

import java.io.IOException;
import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        
        WordCount aplicacion = new WordCount();
        aplicacion.setSize(400,400);
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setVisible(true);
        

    }

}
