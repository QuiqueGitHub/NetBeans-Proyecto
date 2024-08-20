/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.almacen;
import static com.mycompany.almacen.MergeSort.mergeSort;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kike0
 */
public class Trabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        char menu;
        Avion nuevoAvion;
        Camion nuevoCamion;
        Barco nuevoBarco;
        Scanner trabajador = new Scanner(System.in);
        do{
        System.out.println("Sistema de Paqueteria:");
        System.out.println("    1)Registrar vehiculos");
        System.out.println("    2)Ver ordenes pendientes");
        System.out.println("    3)Procesar envios");
        System.out.println("Seleccione accion a realizar: ");
        opc = trabajador.nextInt();
        trabajador.nextLine();
        switch(opc){
            case 1 -> {
                char transporte;
                System.out.println("Que transporte quiere registrar (A)vion, (C)amion, (B)arco: ");
                transporte = trabajador.next().charAt(0);
                transporte = Character.toUpperCase(transporte);
                switch(transporte){
                    case 'A' -> {
                        nuevoAvion = new Avion();
                        Listas.getVehiculos().add(nuevoAvion);
                        nuevoAvion.mostrarVehiculo();
                }
                    case 'B' -> {
                        nuevoBarco = new Barco();
                        Listas.getVehiculos().add(nuevoBarco);
                        nuevoBarco.mostrarVehiculo();
                }
                    case 'C' -> {
                        nuevoCamion = new Camion();
                        Listas.getVehiculos().add(nuevoCamion);
                        nuevoCamion.mostrarVehiculo();
                }
                    default -> System.out.println("Opcion NO disponible");
                }
                
                //Se crea una lista temporal que sea igual a la LinkedList<Transporte> y esa lista temporal es la que se ordena
                LinkedList <Transporte> vehiculos = Listas.getVehiculos();
                List <Transporte> array = new ArrayList<>(vehiculos);
                //Se iran comparando los precios de los vehiculos de transporte
                Comparator<Transporte> costo = Comparator.comparingDouble(Transporte::getPrecio);
                //Tipo de interfaz <Objeto que usa> nombre de la interfaz = Comparator.el tipo de dato que compara(clase que usa::atributo que compara);
                //Se llama a la Java Class MergeSort y se le manda la lista temporal y lo que comparara
                mergeSort(array, costo);
                //Se vacia la LinkedList de vehiculos
                vehiculos.clear();
                //Se le agrega a la LinkedList la lista temporal ya con los vehiculos ordenados de más barato a más caro
                vehiculos.addAll(array);
                }
            
            case 2 -> 
                verInventario();
            case 3 ->  ProcesarEnvios(trabajador);  // Pasamos el Scanner como parámetro
                default -> System.out.println("Opcion NO disponible");
        }
        System.out.println("Desea regresar al menu (s/n): ");
        menu = trabajador.next().charAt(0);
        menu = Character.toUpperCase(menu);
        }while(menu == 'S');
    }
     
    //Funcion para acceder a la linkedList de las ordenas hechas por los clientes
    public static void verInventario() {
        LinkedList<Registro> inventario = Listas.getInventario();
        if (inventario.isEmpty()) {
            System.out.println("No hay ordenes pendientes");
        } else {
            System.out.println("Ordenes pendientes:");
            for (Object item : inventario) {
                System.out.println(item);
            }
        }
    }
    
    //Solo imprime las ordenes que ya hayan seleccionado un vehiculo
                 // Función para procesar envíos
                public static void ProcesarEnvios(Scanner trabajador) {
               LinkedList<Registro> inventario = Listas.getInventario();
               if (inventario.isEmpty()) {
                   System.out.println("No hay ordenes pendientes");
                   return;
               }

               boolean envioProcesado = false;
               for (int i = 0; i < inventario.size(); i++) {
                   Registro orden = inventario.get(i);
                   if (!orden.getVehiculo().equals("Aun no se ha seleccionado un vehiculo para el traslado")) {
                       System.out.println("Procesando el siguiente envio: " + orden);

                       System.out.println("Ingrese la contrasena para procesar el envio: ");
                       String contrasena = trabajador.nextLine();

                       if (contrasena.equals("envio")) {  // Contraseña de ejemplo
                           inventario.remove(i);
                           System.out.println("El envio ha sido procesado y eliminado del inventario.");
                           envioProcesado = true;
                           break;
                       } else {
                           System.out.println("Contrasena incorrecta. No se pudo procesar el envio.");
                           break;
                       }
                   }
               }

               if (!envioProcesado) {
                   System.out.println("No se encontraron ordenes con vehículo asignado para procesar.");
               }
           }
       }
                 
