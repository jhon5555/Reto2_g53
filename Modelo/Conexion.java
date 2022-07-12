
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author JHON JAIRO
 */
public class Conexion {
   //1: Crear instancia de la clase connection
    Connection connection;
    //Atributos
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_g53_bd";
    String usuario = "root";
    String contraseña = "";
    
   //2: Añadir el Constructor sin args de la clase

    public Conexion() {
      //3: Conectar con la base de datos
      try{
      Class.forName(driver);
      connection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
     //4: Verificacion si conexion si devuelve algo 
        if(connection != null ){
            System.out.println("Conexion Exitosa con la base de datos");
        }
      }catch (ClassNotFoundException | SQLException e){
          System.out.println("No se pudo extrablecer conexion con la base de datos");
          
      }
    
    }
   //5: Crear funcion que retorna la clase conexion
    public Connection getConnection(){
        return connection;
    }
 }
