
package persistenciaficheros;

/**
 *
 * @author 46989075y
 */
public class Presupuesto {
    int id;
    String concepto;
    int precioneto;
    String estado;

    public Presupuesto(int id, String concepto, int precioneto, String estado) {
        this.id = id;
        this.concepto = concepto;
        this.precioneto = precioneto;
        this.estado = estado;
    }
 
    public Presupuesto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getPrecioneto() {
        return precioneto;
    }

    public void setPrecioneto(int precioneto) {
        this.precioneto = precioneto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Presupuesto{" + "id=" + id + ", concepto=" + concepto + ", precioneto=" + precioneto + ", estado=" + estado + '}';
    }
    
}
