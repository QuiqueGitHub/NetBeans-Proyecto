/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.almacen;
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
                break;
            case 2:
                break;
            case 3:
                break;
        }
        System.out.println("Desea regresar al menu (s/n): ");
        menu = trabajador.next().charAt(0);
        menu = Character.toUpperCase(menu);
        }while(menu == 'S');
    }
    
}
