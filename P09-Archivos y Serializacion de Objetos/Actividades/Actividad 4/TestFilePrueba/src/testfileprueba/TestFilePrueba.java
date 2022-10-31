/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testfileprueba;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class TestFilePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream file;
        
        byte b[]= new byte[1024];
        
        try{
            file= new FileInputStream("src/testfileprueba/TestFile.java");  //Poner Archivo de ejemplo
            file.read(b);
            String s = new String(b);
            ViewFile view= new ViewFile(s);
            
            view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            view.setSize(400, 150);
            view.setVisible(true);
           
        }
        catch(FileNotFoundException e){
            
            System.out.println(e.getMessage());
            
        }
        catch(IOException e){
            
            System.out.println(e.getMessage());
            
        }
    }
    
}



