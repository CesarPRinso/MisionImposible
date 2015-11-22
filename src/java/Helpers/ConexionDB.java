/*
En esta clase hacemos la conexion a la base de datos
si te das cuenta en libraries (carpeta Libraries)
es necesario colocar el el .jar del conector a la base de datos
en este caso usamos JDBC 
quiere decir conexion java a la base de datos
en ingles Java data base coneccion algo asi se escribe xD 
Con esto tendremos todas las funcionalidades a la base de datos
*/
package Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private final static String DRIVER = "com.mysql.jdbc.Driver";// hace referencia al manipulador de base de datos
    // que se encuetra en el jar que te mencion en la parte superior
    private final static String URL = "jdbc:mysql://localhost:3306/tienda1";// la direccion hacia la bse de datos
    private final static String USU = "root";//el usuario con el que nos identificamos
    private final static String PSW = "root";//La contraseña con la que nos identificamos
    
    //si hay una variable estatica es la variable que no cambia su valor 
    
    //Espero hasta el momento me estes entendiendo :( , trato de ser lo mas detallado para asi ayudarte
     //Te amo demasiado =$
    
    //para llamar a este metodo no es necesario hacer new a la clase, no es necesario instanciar
    //primera tarea ver que siginifica instanciar :) 
    // en todo caso llamar al 975045736 :) 
    
    public static Connection obtenerConexion() throws ClassNotFoundException, SQLException {
        //arroja las exepciones a quien lo llamo	 
        //Representa una conexi�n con una base de datos
        Connection con = null;
        
        Class.forName(DRIVER);
        //es hacer una instancia a la variable
        con = DriverManager.getConnection(URL, USU, PSW);

        return con;
        //Una vez que llamo a este metodo, retorna un tipo de valor de la conexion 
        // mas adelante veremos como ver si la conexion esta bien o no 
        
    }
  
}
