/*
 * 
 */
package Dominio.Usuario;

import Persistencia.UsuarioDAO;

/**
 *
 * @author alanr
 */
public class UsuarioService {
    
    private UsuarioDAO dao;

    public UsuarioService() {
        this.dao = new UsuarioDAO();
    }
    
    public void crearUsuario(String correoElectronico, String clave) throws Exception
    {
        try
        {
            //Validaciones
            if (correoElectronico == null || correoElectronico.trim().isEmpty())
            {
                throw new Exception("Debe indicar correo electronicoqaax");
            }
            if (!correoElectronico.contains("@"))
            {
                throw new Exception("Correo electronico es incorrecto");
            }
            if (clave == null || clave.trim().isEmpty())
            {
                throw new Exception("Debe indicar clave");
            }
            if (clave.length() < 8)
            {
                throw new Exception("Clave debe superar 8 caracteres");
            }
            if (dao.buscarUsuarioPorCorreo(correoElectronico) != null)
            {
                throw new Exception("Usuario existente de correo: " + correoElectronico);
            }
            
            Usuario usuario = new Usuario();
            usuario.setClave(clave);
            usuario.setCorreoElectronico(correoElectronico);
            dao.guardarUsuario(usuario);
            
        } catch (Exception e)
        {
            throw e;
        }
    }
    
    buscarUsuarioPorId(idUsuario)
    
}
