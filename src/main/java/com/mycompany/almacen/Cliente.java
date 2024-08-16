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

    public static void main(String[] args) {
        char cuentas;
        int opcion, hash;
        String nombre, contrasena, cuenta;
        Scanner cliente = new Scanner(System.in);
        do{
        System.out.println("1)Para iniciar sesion");
        System.out.println("2)Para crear una nueva cuenta");
        System.out.print("Seleccione una opcion: ");
        opcion = cliente.nextInt();
        cliente.nextLine();
        switch(opcion){
            case 1 -> {
                System.out.print("Ingrese su contrasena: ");
                contrasena = cliente.nextLine();
                cuenta = ClienteData.clientes.get(contrasena);
                if (cuenta != null) {
                    NombresCuentas.CuentaNombre = cuenta; //Hace disponible el nombre para el resto de clases
                    ClienteMenu.main(args); //Llama al menu de opciones para cliente
                } 
                else{
                    System.out.println("Esta cuenta no existe");
                }
                }
            case 2 -> {
                do{
                    System.out.println("Ingrese el nombre de su nueva cuenta:");//El nombre es el value de la tabla hash
                    nombre = cliente.nextLine();
                    if (ClienteData.clientes.containsValue(nombre)){
                        System.out.println("Esta nombre YA esta registrado");
                    }
                }while(ClienteData.clientes.containsValue(nombre));
                do{
                    System.out.println("Ingrese la contrasena de su nueva cuenta:");
                    contrasena = cliente.nextLine();
                    if (ClienteData.clientes.containsKey(contrasena)){
                        System.out.println("Esta contrasena YA existe");
                    }
                }while(ClienteData.clientes.containsKey(contrasena));
                if(nombre.isEmpty() || contrasena.isEmpty()){//Se necesita registrar algo
                    System.out.println("El nombre y la contrasena no pueden estar vacios.");
                } 
                else{
                    ClienteData.clientes.put(contrasena, nombre);//Manda los datos a la tabla hash
                    hash = contrasena.hashCode() % ClienteData.clientes.size();
                    NombresCuentas.hashCode = hash;
                    System.out.println("Cuenta creada exitosamente");
                    System.out.println("Nombre: " + ClienteData.clientes.get(contrasena));
                    System.out.println("Contrasena: " + contrasena);
                    System.out.println("Contrasena hashCode: " + hash);
                }
                }
            default -> System.out.println("Opcion NO valida");
        }
        System.out.println("Esta listo para iniciar sesion (s/n): ");
        cuentas = cliente.next().charAt(0);
        cuentas = Character.toUpperCase(cuentas);
        cliente.nextLine();
    }while(cuentas == 'S');
       
        }
    
}
