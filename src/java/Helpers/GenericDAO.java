/*
Esta clases nos ayuda a tener todo uniforme
de la misma manera usamos el plimorfismo
porque ? porque tenemos el interface, donde ayuda a que varias clases 
herenden de esta
luego te explicare como funciona :) al momento de heredar :) 
 */
package Helpers;


import java.util.List;

/**
 *
 * @author pantojarosales
 */
public interface GenericDAO<T> {

    
    public List<T> list();

    public T get(Long t);

    public int save(T t);

    public int update(T t);

    public int delete(int t);

}
