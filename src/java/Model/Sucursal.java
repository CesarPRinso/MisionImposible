/*
 * 
    En esta clase encontraremos el objeto de Sucursal 
    Objeto quiere decir modelo del mundo, una plantilla.
    En este caso encontramos la clase sucursal con todas sus caracteriscticas    
 */
package Model;

/**
 *
 * @author pantojarosales
 */
public class Sucursal {
    
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
    
}
