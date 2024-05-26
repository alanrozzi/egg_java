
package Persistencia;

//Final: evita que hereden de la clase

import Dominio.Usuario.Usuario;
import java.util.ArrayList;
import java.util.Collection;

public final class UsuarioDAO extends DAO {
    
    public void guardarUsuario(Usuario usuario) throws Exception
    {
        try
        {
            if (usuario == null)
            {
                throw new Exception("Debe indicar un usuario");
            }
            
            String sql = "INSERT INTO usuario (correoElectronico, clave) "
                    + "VALUES ('" + usuario.getCorreoElectronico() + "' , '" + usuario.getClave() + "' );";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e)
        {
            throw e;
        }
    }
    
    public void modificarUsuario(Usuario usuario) throws Exception
    {
        try
        {
            if (usuario == null)
            {
                throw new Exception("Debe indicar un usuario que se desea modificar");
            }
            
            String sql = "UPDATE usuario SET "
                    + "clave ='" + usuario.getClave()+ "' "
                    + "WHERE correoElectronico = '" + usuario.getCorreoElectronico() + "';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e)
        {
            throw e;
        }
    }
    
    public void eliminarUsuario(String correoElectronico) throws Exception
    {
        try
        {
            String sql = "DELETE FROM usuario WHERE correoElectronico = '" + correoElectronico + "'";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e)
        {
            throw e;
        }
    }
    
    public Usuario buscarUsuarioPorCorreo(String correoElectronico) throws Exception
    {
        try
        {
            String sql = "SELECT * FROM usuario "
                    + "WHERE correoElectronico = '" + correoElectronico + "';";
            
            consultarBase(sql);
            
            Usuario usuario = null;
            
            //Se rellena
            while (resultado.next())
            {
                usuario = new Usuario();
                
                //Se toman los datos desde la columna 1
                usuario.setId(resultado.getInt(1));
//                usuario.setId(resultado.getInt("id"));
                usuario.setCorreoElectronico(resultado.getString(2));
                usuario.setClave(resultado.getString(3));
            }
            desconectarBase();
            return usuario;
            
        } catch (Exception e)
        {
            //algo paso mal, entonces me desconecto y tiro el error
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Usuario> listarUsuarios(String correoElectronico) throws Exception
    {
        try
        {
            String sql = "SELECT correoElectronico, clave  FROM usuario ";
            
            consultarBase(sql);
            
            Usuario usuario = null;
            Collection<Usuario> usuarios = new ArrayList();
            
            //Se rellena
            while (resultado.next())
            {
                usuario = new Usuario();
               
                usuario.setCorreoElectronico(resultado.getString(1));
                usuario.setClave(resultado.getString(2));
                
                usuarios.add(usuario);
            }
            desconectarBase();
            return usuarios;
            
        } catch (Exception e)
        {
            e.printStackTrace();
            //algo paso mal, entonces me desconecto y tiro el error
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
}
