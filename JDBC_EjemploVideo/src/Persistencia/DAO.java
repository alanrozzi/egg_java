
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    
    //Toman los datos de la DDBB
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    //Contantes que permiten la conexion a DDBB
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "perros";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException
    {
        try
        {
            Class.forName(DRIVER);
            //Desactiva warnings molestos
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            
            //Valores de conexion
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e)
        {
            throw e;
        }
    }
    
    protected void desconectarBase() throws Exception
    {
        try
        {
            //Si alberga algun resultado de consultas
            if (resultado != null)
            {
                //Cierro la conexion
                resultado.close();
            }
            
            //Si existe sentencia / query a ejecutar
            if (sentencia != null)
            {
                sentencia.close();
            }
            
            if (conexion != null)
            {
                conexion.close();
            }
            
        } catch (Exception e)
        {
            throw e;
        }
    }
    
    //Metodo que impacta a la DDBB, con la consulta a ejecutar
    protected void insertarModificarEliminar(String sql) throws ClassNotFoundException, SQLException, Exception
    {
        try
        {
             //Necesito conectarme a la base de datos
            conectarBase();
            
            //Vuelco lo que es potencial creacion de una sentencia / query
            sentencia = conexion.createStatement();
            //ejecuta la query que esperaba tener
            sentencia.executeUpdate(sql);
            
        } catch (ClassNotFoundException | SQLException e)
        {
            //Permite 'volver atras' por si ocurre un error y no ejecute nada (TODO BIEN O NADA)
            //conexion.rollback();
            /*
                Desconectar la linea anterior si se desean tener en cuenta el rollback.
                Correr el sigueinte script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback anda igual
            */
            throw e;
        }
        finally
        {
            desconectarBase();
        }
        
    }
    
    protected void consultarBase(String sql) throws Exception
    {
        //Necesito solo consultar la DDBB sin odificar nada, asi que traigo los datos
        try
        {
            conectarBase();
            sentencia = conexion.createStatement();
            //Resultado contiene el producto de la consulta
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e)
        {
            throw e;
        }
    }
        
    
}
