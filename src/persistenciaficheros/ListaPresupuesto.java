
package persistenciaficheros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 46989075y
 */
public class ListaPresupuesto implements Serializable{
    private ArrayList<Presupuesto>lista_presupuesto;
    public ListaPresupuesto(){
        lista_presupuesto = new ArrayList<>();
    }
    public void registrarPresupuesto(Presupuesto p){
        lista_presupuesto.add(p);
    }
//    public void mostrarPendientes(){
//        
//    }
    
//     public void bajaCliente(Cliente p){
//        lista.remove(p);
//    }
//      public void altaPersona(Cliente p){
//        //lista.add(p);
//    }

    public ArrayList<Presupuesto> getLista_presupuesto() {
        return lista_presupuesto;
    }

    public void setLista_presupuesto(ArrayList<Presupuesto> lista_presupuesto) {
        this.lista_presupuesto = lista_presupuesto;
    }
    
    public List<Presupuesto> found (){
         return lista_presupuesto;
    }
    
    
}
