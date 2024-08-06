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
        Registro nuevoRegistro;
        do{
        System.out.println("Bienvenido " + NombresCuentas.CuentaNombre);//Recibe el nombre del caso 1 en cliente
        System.out.println("    1)Registrar envio");
        System.out.println("    2)Ver vehiculos disponibles");
        System.out.println("    3)Ver estado de mis ordenes");
        System.out.println("Que desea realizar: ");
        acc = scan.nextInt();
        scan.nextLine();
        switch(acc){
            case 1:
                nuevoRegistro = new Registro();
                Listas.getInventario().add(nuevoRegistro);
                nuevoRegistro.mostrarOrden();
                break;
            case 2:
                verVehiculos();
                break;
            case 3:
                //Aqui es donde se usaran las interfaces de java
                break;
            default:
                System.out.println("Opcion NO valida");
        }
        
        System.out.println("Desea realizar otra accion (s/n):");
        menu = scan.next().charAt(0);
        menu = Character.toUpperCase(menu);
        }while(menu == 'S');
        
    }
    
    public static void verVehiculos() {
        LinkedList<Object> Vehiculos = Listas.getVehiculos();
        if (Vehiculos.isEmpty()) {
            System.out.println("No hay vehiculos disponibles");
        } else {
            System.out.println("Vehiculos disponibles:");
            for (Object item : Vehiculos){
                //Condicional para solo mostrar los que cumplan con los precios y cargas de los envios registrados
                System.out.println(item);
            }
        }
    }
    /*
    public static void verInventario() {
        LinkedList<Object> inventario = Listas.getInventario();
        if (inventario.isEmpty()) {
            System.out.println("No hay ordenes pendientes");
        } else {
            System.out.println("Tus ordenes:");
            if(this.cuenta)
            for (Object item : inventario) {
                System.out.println(item);
            }
        }
    }*/
    
}
