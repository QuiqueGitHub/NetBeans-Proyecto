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
        Scanner trabajador = new Scanner(System.in);
        do{
        System.out.println("Sistema de Paqueteria:");
        System.out.println("    1)Registrar vehiculos");
        System.out.println("    2)Ver ordenes pendientes");
        System.out.println("    3)Procesar envios");
        opc = trabajador.nextInt();
        trabajador.nextLine();
        switch(opc){
            case 1:
                 System.out.println("Que transporte quiere registrar (A)vion, (C)amion, (B)arco: ");
                    char transporte = trabajador.next().charAt(0);
                    transporte = Character.toUpperCase(transporte);
                    switch(transporte){
                        case 'A':
                            Listas.getVehiculos().add(new Avion());
                            break;
                        case 'B':
                            Listas.getVehiculos().add(new Barco());
                            break;
                        case 'C':
                            Listas.getVehiculos().add(new Camion());
                            break;
                        default: 
                            System.out.println("Opcion NO disponible");
                    }
                break;
            case 2:
                verInventario();
                break;
            case 3:
                break;
        }
        System.out.println("Desea regresar al menu (s/n): ");
        menu = trabajador.next().charAt(0);
        menu = Character.toUpperCase(menu);
        }while(menu == 'S');
    }
     
    public static void verInventario() {
        LinkedList<Object> inventario = Listas.getInventario();
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Contenido del inventario:");
            for (Object item : inventario) {
                System.out.println(item);
            }
        }
    }
    
}
