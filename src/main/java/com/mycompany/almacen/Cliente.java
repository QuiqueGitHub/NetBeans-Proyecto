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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        String nombre, contraseña;
        Scanner cliente = new Scanner(System.in);
        System.out.println("1)Para iniciar sesion");
        System.out.println("2)Para crear una nueva cuenta");
        opcion = cliente.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese su contrasena:");
                contraseña = cliente.nextLine();
                break;
            case 2:
                System.out.println("Ingrese el nombre de su nueva cuenta:");
                nombre = cliente.nextLine();
                System.out.println("Ingrese la contraseña de su nueva cuenta:");
                contraseña = cliente.nextLine();
                break;
        }
    }
    
}
