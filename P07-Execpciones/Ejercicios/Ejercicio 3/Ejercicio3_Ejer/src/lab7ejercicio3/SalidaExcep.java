
package lab7ejercicio3;

import java.io.IOException;

public class SalidaExcep extends IOException{
    
    public SalidaExcep(String mensaje) {
        
        super(mensaje);
    }
}
