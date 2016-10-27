
package persistenciaficheros;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 46989075y
 */
public class ListaCliente implements Serializable {
 private ArrayList<Cliente> lista_cliente;  
 
 public ListaCliente(){
     lista_cliente = new ArrayList<>();
 }
 public void registrarCliente(Cliente p){
     lista_cliente.add(p);
 }
 public void bajaCliente(Cliente p){
     lista_cliente.remove(p);
 }
 public Cliente encontrar(int telefono){
     for(Cliente cliente : lista_cliente){
         if(cliente.getTelefono() == telefono){
             return cliente;
         }
     }
return null;
 }

    public ArrayList<Cliente> getLista_cliente() {
        return lista_cliente;
    }

    public void setLista_cliente(ArrayList<Cliente> lista_cliente) {
        this.lista_cliente = lista_cliente;
    }
 
}
