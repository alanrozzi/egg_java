
package Principal;

import Dominio.Usuario.UsuarioService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass {

    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();
        
        try
        {
            usuarioService.crearUsuario("hola@admin.com", "prueba123");
            
        } catch (Exception e)
        {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
}
 