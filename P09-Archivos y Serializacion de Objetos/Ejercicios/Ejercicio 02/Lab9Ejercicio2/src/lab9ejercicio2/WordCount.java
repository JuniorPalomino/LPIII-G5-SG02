package lab9ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WordCount extends JFrame {

    private final JTextArea j1;
    private int nroCaracteres = 0;
    private int nroPalabras = 0;
    private int nroLineas = 0;

    public WordCount() throws IOException {
        super("Contador de palabras");
        j1 = new JTextArea();
        add(new JScrollPane(j1));   //areaSalida cuenta con controles deslizables
        analizarRuta();     //obtiene el objeto Path del usuario y muestra la informacion
    }

    public void analizarRuta() throws IOException {
        // crea un objeto Path con la ruta del archivo o directorio seleccionado por el usuario
        Path ruta = obtenerRutaArchivoDirectorio();
        FileReader fr = new FileReader(String.format("%s", ruta));
        BufferedReader br = new BufferedReader(fr);

        if (ruta != null && Files.exists(ruta)) {

            StringBuilder builder = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(linea);
                nroLineas += 1;
                nroPalabras += stk.countTokens();
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) != ' ' ) {
                        nroCaracteres += 1;
                    }
                }
            }

            builder.append(String.format("Archivo:\t%s%n", ruta.getFileName()));
            builder.append(String.format("Caracteres:\t%s%n", nroCaracteres));
            builder.append(String.format("Palabras:\t%s%n", nroPalabras));
            builder.append(String.format("Lineas:\t%s%n", nroLineas));
            
            j1.setText(builder.toString());     // muestra el contenido del objeto String
        } else {
            JOptionPane.showMessageDialog(this, ruta.getFileName() + " no existe.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        fr.close();

    }

    private Path obtenerRutaArchivoDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorArchivos.showOpenDialog(this);
        // si el usuario hizo clic en el boton Cancelar en el cuadro de diálogo, regresa 
        if (resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(1);
        }
        // devuelve objeto Path que representa el archivo seleccionado
        return selectorArchivos.getSelectedFile().toPath();
    }

}
