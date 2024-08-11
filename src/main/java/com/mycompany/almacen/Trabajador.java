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
        opc = trabajador.nextInt();
        trabajador.nextLine();
        switch(opc){
            case 1 -> {
                System.out.println("Que transporte quiere registrar (A)vion, (C)amion, (B)arco: ");
                char transporte = trabajador.next().charAt(0);
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
                }
            case 2 -> 
                verInventario();
            case 3 -> 
                //Solo pon que tengas que escribir la contraseña anterior
                //Que solo salga el PRIMER elemento de la lsita inventario
                //Al poner la contraseña se elimine de las listas la orden
                System.out.println("Opcion NO disponible");
            
            default -> System.out.println("Opcion NO disponible");
        }
        System.out.println("Desea regresar al menu (s/n): ");
        menu = trabajador.next().charAt(0);
        menu = Character.toUpperCase(menu);
        }while(menu == 'S');
    }
     
    //Funcion para acceder a la linkedList de las ordenas hechas por los clientes
    public static void verInventario() {
        LinkedList<Object> inventario = Listas.getInventario();
        if (inventario.isEmpty()) {
            System.out.println("No hay ordenes pendientes");
        } else {
            System.out.println("Ordenes pendientes:");
            for (Object item : inventario) {
                System.out.println(item);
            }
        }
    }
    
}
