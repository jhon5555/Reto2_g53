
package principal;
import vistas.*;
import Modelo.*;

/**
 *
 * @author JHON JAIRO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1: Llamamos la clase conexion para conectar
        Conexion connection = new Conexion();
        connection.getConnection();
        // 2: Creamos la instancia  de la  vista Login
        
        Login login = new Login();
        //3: El metodo setVisible hace visible la ventana
        login.setVisible(true);
    }
    
}
