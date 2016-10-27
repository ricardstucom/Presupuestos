
package persistenciaficheros;

import tools.InputData;
import tools.Fichero;

public class main {
//private static ListaPresupuesto misPresupuestos;

    private static ListaCliente misClientes;
//private static ListaPresupuesto misPresupuestos;
    private static Fichero miFichero;

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        miFichero = new Fichero("clientes.xml");//Si no ponemos ruta absoluta lo creara en la raiz del proyecto
        misClientes = (ListaCliente) miFichero.leer();
        if (misClientes == null) {
            misClientes = new ListaCliente();
        }
        int opcion;
        do {
            mostrarMenu();
            opcion = InputData.pedirEntero("Escoge una opción");
            switch (opcion) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    NuevoPresupuesto();
                    break;
                case 3:
                    mostrarPendientes2();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Hasta luegoooo!!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("*****EMPRESA****");
        System.out.println("1.Alta Cliente");
        System.out.println("2.Nuevo presupuesto");
        System.out.println("3.Presupuestos pendientes ");
        System.out.println("4.Listado de presupuestos de un cliente determinado");
        System.out.println("5.Listado de presupuestos rechazados");
        System.out.println("6.Listado de clientes, donde aparezca también el total de presupuestos\n"
                + "que tiene cada uno.");
        System.out.println("7.Cambiar estado de un presupuesto.");
        System.out.println("0. Salir");
    }

    private static void altaCliente() {
        String nombre;
        String apellidos;
        int telefono;
        boolean vip = false;
        String importante;
        nombre = InputData.pedirCadena("Nombre: ");
        apellidos = InputData.pedirCadena("Apellidos: ");
        telefono = InputData.pedirEntero("Telefono: ");
        do {
            importante = InputData.pedirCadena("Eres VIP (SI/NO): ");
            if (importante.equalsIgnoreCase("NO")) {
                vip = false;
            } else if (importante.equalsIgnoreCase("SI")) {
                vip = true;
            } else {
                System.out.println("Debes responder SI o NO");
            }
        } while (!importante.equalsIgnoreCase("si") && !importante.equalsIgnoreCase("no"));
        Cliente c = new Cliente(nombre, apellidos, telefono, vip);
        misClientes.registrarCliente(c);
        miFichero.grabar(misClientes);
    }

    private static void cadenaNoVacia(String msg) {
        String cadena;
        do {
            cadena = InputData.pedirCadena("Titulo: ");
            if (cadena.equals("")) {
                System.out.println("No puedes dejar el titulo en blanco");
            }
        } while (cadena.equals(""));
    }

    private static void NuevoPresupuesto() {
        int telefono;

        telefono = InputData.pedirEntero("Telefono: ");
        Cliente cliente = misClientes.encontrar(telefono);
        if (cliente == null) {
            String crear;
            System.out.println("No existe este cliente");
            crear = InputData.pedirCadena("Quieres crearlo?");
            if (crear.equalsIgnoreCase("SI")) {
                altaCliente();
            }
        } else {
            String concepto;
            int precioneto;
            String estado;
            concepto = InputData.pedirCadena("Concepto: ");
            precioneto = InputData.pedirEntero("Precioneto: ");
            estado = InputData.pedirCadena("Estado: ");
            Presupuesto c = new Presupuesto(telefono, concepto, precioneto, estado);
                cliente.getPresupuesto().registrarPresupuesto(c); 
//            c.getPresupuestos().registrarPresupuesto(p);
            miFichero.grabar(misClientes);
        }

    }


    private static void mostrarPendientes2(){
     
       for(Cliente cliente : misClientes.getLista_cliente()){
            for(Presupuesto presupuesto : cliente.getPresupuesto().getLista_presupuesto()){
                if(presupuesto.getEstado().equalsIgnoreCase("pendiente")){
                       System.out.println("----------------------------------------------");
                    System.out.println("PRESUPUESTOS PENDIENTES");
                       System.out.println("----------------------------------------------");
                    System.out.println("Nombre :"+cliente.getNombre());
                    System.out.println("Apellido :"+cliente.getApellidos());
                    System.out.println("Concepto: "+presupuesto.getConcepto());
                    System.out.println("Precioneto: "+presupuesto.getPrecioneto());
                    System.out.println("----------------------------------------------");
                    
                }
            }
       
       }
    }
     }
