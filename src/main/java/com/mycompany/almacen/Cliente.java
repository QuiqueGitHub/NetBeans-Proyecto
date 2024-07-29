/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.almacen;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author kike0
 */
public class Cliente {
    

    /**
     * @param args the command line arguments
     */
    public static void startMenu() {
        Hashtable<String, String> clientes = new Hashtable<>(10, 0.90f);
        char cuentas;
        int opcion;
        String nombre, contrasena, cuenta;
        Scanner cliente = new Scanner(System.in);
        do{
        System.out.println("1)Para iniciar sesion");
        System.out.println("2)Para crear una nueva cuenta");
        System.out.print("Seleccione una opcion: ");
        opcion = cliente.nextInt();
        cliente.nextLine();
        switch(opcion){
            case 1:
                System.out.print("Ingrese su contrasena: ");
                contrasena = cliente.nextLine();
                cuenta = ClienteData.clientes.get(contrasena);
                if (cuenta != null) {
                    System.out.println("Nombre asociado: " + cuenta);
                } 
                else{
                    System.out.println("Esta cuenta no existe");
                    }
                break;
            case 2:
                System.out.println("Ingrese el nombre de su nueva cuenta:");
                nombre = cliente.nextLine();
                System.out.println("Ingrese la contrasena de su nueva cuenta:");
                contrasena = cliente.nextLine();
                if(nombre.isEmpty() || contrasena.isEmpty()){
                        System.out.println("El nombre y la contrasena no pueden estar vacios.");
                    } 
                else{
                        clientes.put(contrasena, nombre);
                        System.out.println("Cuenta creada exitosamente.");
                        System.out.println("Contrasena hashCode: " + contrasena.hashCode());
                        System.out.println("Contrasena: " + contrasena);
                        System.out.println("Nombre asociado: " + clientes.get(contrasena));
                    }
                    break;
        }
        System.out.println("Desea ingresar con otra cuenta (s/n): ");
        cuentas = cliente.next().charAt(0);
        cuentas = Character.toUpperCase(cuentas);
        cliente.nextLine();
    }while(cuentas == 's');
       
        }
    
}
