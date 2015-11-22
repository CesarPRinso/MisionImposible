/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.SucursalDAO;
import Helpers.ConexionDB;
import Model.Sucursal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author pantojarosales
 */
public class PruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Connection con = null;
//
//        try {
//            con = ConexionDB.obtenerConexion();
//            if (con != null ) {
//                System.out.println("Conexion OK");
//            }
//
//        } catch (ClassNotFoundException ex) {
//            System.out.println("No se encontro la clase");
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//
//        } finally {
//            try {
//                if (con != null && !con.isClosed()) {
//                    con.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
        
//        List<Sucursal>lista = null;
//        
//        lista = SucursalDAO.list();
//        
//        for (Sucursal bean : lista){
//            System.out.println(bean);
//        }
        
        
        Sucursal suc = new Sucursal();
        
        suc.setId(2);
        suc.setNombre("sin nombre");
        suc.setDireccion("Campiña de moche");
        suc.setTelefono("123456789");
        
     int result =  SucursalDAO.CrearSucursal(suc);
     
     if (result>0){
         System.out.println("La sucursal se creo correctamente");
     }
     else{
         
         System.out.println("Problemas al crear la sucursal");
     }
    }

}
