/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.almacen;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author kike0
 */
public class ClienteMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Object> Vehiculos = Listas.getVehiculos();
        Scanner scan = new Scanner(System.in);
        String matricula;
        char menu;
        int acc;
        long folioBusqueda;
        Registro nuevoRegistro;
        do{
        System.out.println("Bienvenido " + NombresCuentas.CuentaNombre);//Recibe el nombre del caso 1 en cliente
        System.out.println("    1)Registrar envio");
        System.out.println("    2)Ver vehiculos disponibles");
        System.out.println("    3)Mis ordenes");
        System.out.println("    4)Ver estado de mis ordenes");
        System.out.println("Que desea realizar: ");
        acc = scan.nextInt();
        scan.nextLine();
        switch(acc){
            case 1 -> {
                nuevoRegistro = new Registro();
                Listas.getInventario().add(nuevoRegistro);
                nuevoRegistro.mostrarOrden();
                }
            case 2 -> {
                System.out.println("Ingresa el folio de la orden que quieres visitar");
                folioBusqueda = scan.nextLong();
                scan.nextLine();
                comprobarFolio(folioBusqueda);
                if (Vehiculos.isEmpty()) {
                    break;
                }else{
                    System.out.println("Ingresa la matricula del vehiculo que quiera seleccionar");
                    matricula = scan.nextLine();
                    comprobarMatricula(matricula, folioBusqueda);
                }
            }
            case 3 -> verInventario();
            case 4 -> {
                //Aqui es donde se usaran las interfaces de java
            }
                
            default -> System.out.println("Opcion NO valida");
        }
            
        System.out.println("Desea realizar otra accion (s/n):");
        menu = scan.next().charAt(0);
        menu = Character.toUpperCase(menu);
        }while(menu == 'S');
        
    }
    
    public static void comprobarFolio(long folioBusqueda) {
        int x;
        long folioDispo, presupuesto;
        float pesof;
        boolean existe = false;
        for (x = 0; x < Listas.getInventario().size(); x++) {
            Registro registro = (Registro) Listas.getInventario().get(x);
            if (folioBusqueda == registro.getFolio().getFolio()) {//Un getFolio() te lleva a registro donde es tipo Tiempo, y el otro getFolio() te lleva al folio en tiempo que ya es tipo long
                //Si el folio si es encontrado, saca el peso, y presupuesto de esa orden y la envia a otra funcion junto al folio
                existe = true;
                pesof = registro.getPesof();
                presupuesto = registro.getPresupuesto();
                folioDispo = registro.getFolio().getFolio();
                verVehiculos(pesof, presupuesto, folioDispo);
            }
        }
        if(!existe){
            System.out.println("Folio de orden NO encontrado");
        }
    }
    
    public static void comprobarMatricula(String matricula, long folioBusqueda) {
        boolean existe = false;
        int x;
        for (x = 0; x < Listas.getVehiculos().size(); x++) {
            Transporte vehiculos = (Transporte) Listas.getVehiculos().get(x);
            if (matricula.equals(vehiculos.getMatricula())) {//Un getFolio() te lleva a registro donde es tipo Tiempo, y el otro getFolio() te lleva al folio en tiempo que ya es tipo long
                existe = true;
                break;
            }
        }
        if(existe){
            apartarVehiculo(matricula, folioBusqueda);
        }
        if(!existe){
            System.out.println("Matricula de vehiculo NO encontrada");
        }
    }
    
    public static void apartarVehiculo(String matricula,long folioBusqueda){
        LinkedList<Object> inventario = Listas.getInventario();
        for(Object item: inventario){
            Registro ordenes = (Registro) item;
            if (folioBusqueda == ordenes.getFolio().getFolio()) {//Un getFolio() te lleva a registro donde es tipo Tiempo, y el otro getFolio() te lleva al folio en tiempo que ya es tipo long
                //Si el folio si es encontrado, saca el peso, y presupuesto de esa orden y la envia a otra funcion junto al folio
                ordenes.setVehiculo(matricula);
            }
        }   
    }
    
    public static void verVehiculos(float pesof, long presupuesto, long folioDispo) {//<- Aqui se reciben los parametros rescatados en comprobarFolio
        LinkedList<Object> Vehiculos = Listas.getVehiculos();
        if (Vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos disponibles");
        } else {
            System.out.println("Vehiculos que cumplen con los requisitos de tu orden:");
            for (Object item : Vehiculos) {//Recorre el tamaño de la lista
                if(item instanceof Transporte vehiculos) {//Se usa instanceof para sacar el valor de la cuenta en registro
                    if(presupuesto >= vehiculos.getPrecio() && pesof <= vehiculos.getCarga()) {
                        System.out.println(vehiculos);
                    }
                }
            }
        }
    }
    
    //Se imprimen las ordenes que solo tengan el nombre de la cuenta correcto dentro del registro
      public static void verInventario() {
        LinkedList<Object> inventario = Listas.getInventario();
        if (inventario.isEmpty()) {
            System.out.println("No hay ordenes pendientes");
        } else {
            System.out.println("Tus ordenes:");
            for (Object item : inventario) {//Recorre el tamaño de la lista
                if(item instanceof Registro ordenes) {//Se usa instance of para sacar el valor de la cuenta en registro
                    if (ordenes.getCuenta().equals(NombresCuentas.CuentaNombre)) {
                        System.out.println(ordenes);
                    }
                }
            }
        }
    }
}

   
