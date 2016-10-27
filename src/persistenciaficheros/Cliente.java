
package persistenciaficheros;

/**
 *
 * @author 46989075y
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private int telefono;
    private boolean vip;
    private ListaPresupuesto presupuesto;

    public Cliente(String nombre, String apellidos, int telefono, boolean vip) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.vip = vip;
        presupuesto = new ListaPresupuesto();
       
    }

    public Cliente() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public ListaPresupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(ListaPresupuesto Presupuesto) {
        this.presupuesto = Presupuesto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", vip=" + vip + ", Presupuesto=" + presupuesto + '}';
    }
    
}
