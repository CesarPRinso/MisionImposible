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

        Statement stmt = null;
        ResultSet rs = null;
        List<Sucursal> listaSucursal = null;
        Sucursal sucursal = null;
        Connection con = null;

        try {

            listaSucursal = new ArrayList<Sucursal>();
            con = ConexionDB.obtenerConexion();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM sucursal");

            while (rs.next()) {

                sucursal = new Sucursal();

                sucursal.setId(rs.getInt("Id"));
                sucursal.setNombre(rs.getString("nombre"));
                sucursal.setDireccion(rs.getString("direccion"));
                sucursal.setTelefono(rs.getString("telefono"));

                listaSucursal.add(sucursal);

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

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
