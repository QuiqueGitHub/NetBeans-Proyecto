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
        Scanner scan = new Scanner(System.in);
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
                comprobarFolio(folioBusqueda);
                System.out.println("Ingresa la matricula del vehiculo que quiera seleccionar");
               
                
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
        long folioDispo, presupuesto;
        float pesof;
        for (int x = 0; x < Listas.getInventario().size(); x++) {
            Registro registro = (Registro) Listas.getInventario().get(x);
            if (folioBusqueda == registro.getFolio().getFolio()) {//Un getFolio() te lleva a registro donde es tipo Tiempo, y el otro getFolio() te lleva al folio en tiempo que ya es tipo long
                pesof = registro.getPesof();
                presupuesto = registro.getPresupuesto();
                folioDispo = registro.getFolio().getFolio();
                verVehiculos(pesof, presupuesto, folioDispo);
                break;
            }
        }
        
    }
    
    public static void verVehiculos(float pesof, long presupuesto, long folioDispo) {
        LinkedList<Object> Vehiculos = Listas.getVehiculos();
        if (Vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos disponibles");
        } else {
            System.out.println("Vehiculos que cumplen con los requisitos de tu orden:");
            for (Object item : Vehiculos) {//Recorre el tamaño de la lista
                if(item instanceof Transporte) {//Se usa instance of para sacar el valor de la cuenta en registro
                    Transporte vehiculos = (Transporte) item;
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
                if(item instanceof Registro) {//Se usa instance of para sacar el valor de la cuenta en registro
                    Registro ordenes = (Registro) item;
                    if (ordenes.getCuenta().equals(NombresCuentas.CuentaNombre)) {
                        System.out.println(ordenes);
                    }
                }
            }
        }
    }
}

   
