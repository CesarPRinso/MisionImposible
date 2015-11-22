/*
 *Ahora en esta clase llamada SucursaDAO 
encontraremos todas las operaciones con base de datos
que en otros nombres se conoce como CRUD
Tarea averiguar que siginifia CRUD----

 */
package DAO;

import Helpers.ConexionDB;
import Helpers.GenericDAO;
import Model.Sucursal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pantojarosales
 */

public class SucursalDAO {
/*este metodo lista todos los Sucursales desde la base de datos
// este quiere decir que lo mismo que hacemos en la base de datos select * from TABLA}
    lo mismo debe de pasar con esto, traer todos los datos desde la base de datos de la tabla
    sucursal
    te amo mucho.... porfavor dime si vas etendiendo :)
    */
    public static List<Sucursal> list() throws ClassNotFoundException, SQLException {
        
        //esta variable son las declariones que hacemos a la base de datos
        Statement stmt = null;
        
        //esta variable es como un array(lista de objetos que es como una coleccion)
        /*
        Averiguame que es una coleccion y que es un lifo y un fifo 
        y el array que de los dos son (dime si entendiste la tareita :) te amo)       
        bueno esta variable de tipo Resulset es la que alojara los resultados de la base de datos 
        para despues recorrer su contenido
        */        
        ResultSet rs = null;
        
        //Variable de lista de tipo Sucursal, esto quiere decir que tomara la plantilla de tipo Sucursal 
        //entonces todos los objetos de la lista seran de tipo Sucursal
        List<Sucursal> listaSucursal = null;
        //Un objeto de tipo sucursal 
        Sucursal sucursal = null;
        //variable de tipo conexion, que se nos hara util para abrir una conexion 
        Connection con = null;
//en los DAO siempra va el try para capturara cualquier error que salga
        try {
            //inicializamos la variable Listasucursal
            //OJO : aca debes haber cumplido la tarea que te deje antes
            // te amooo...!!
            listaSucursal = new ArrayList<Sucursal>();
            //la variable antes de clarada de tipo conexion serviria para abrir una conxion
            //en esta linea llamos al metodo Conexion para enlazarnos con la BD
            con = ConexionDB.obtenerConexion();
            //aca creamos una consulta o preparamos la variable para realizar la consulta
            stmt = con.createStatement();
            //aca le indicamos a la variable statement que ejecute la siguiente linea en la base de datos
            //luego el resutaldo de esa consulta se alojara en rs.
            // osea la lista estara en la variable rs
            rs = stmt.executeQuery("SELECT * FROM sucursal");
            
            // mientras tengamos objetos en la lista rs se hara este
            while (rs.next()) {

                sucursal = new Sucursal();

                sucursal.setId(rs.getInt("Id"));
                sucursal.setNombre(rs.getString("nombre"));
                sucursal.setDireccion(rs.getString("direccion"));
                sucursal.setTelefono(rs.getString("telefono"));
//agrgamos por cada interacion el objet oobtenido a la lista Sucursal
                listaSucursal.add(sucursal);

            }

        } catch (SQLException ex) {
            //atramos el error si lo hubiera
            // pero si no hay no sirve
            // te amo mucho
            System.out.println(ex);
        }
//Y por ultimo retornamos la lista de sucursales
        return listaSucursal;

    }

    public static int CrearSucursal(Sucursal sucursal) throws ClassNotFoundException, SQLException {

        int result = 0;

        Connection con = null;

        PreparedStatement pstm = null;

        String sql = null;

        try {

            sql = "INSERT INTO sucursal (Id, nombre, direccion, telefono) VALUES (?,?,?,?)";

            con = ConexionDB.obtenerConexion();

            con.setAutoCommit(false);

            pstm = con.prepareStatement(sql);

            pstm.setInt(1, sucursal.getId());
            pstm.setString(2,sucursal.getNombre() );
            pstm.setString(3, sucursal.getDireccion());
            pstm.setString(4, sucursal.getTelefono());
            result = pstm.executeUpdate();

            con.commit();

        } catch (Exception ex) {

            con.rollback();

            throw ex;
        } 

        return result;
    }

}
