/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almacen;

import java.util.Scanner;



/**
 *
 * @author kike0
 */
public class Almacen {
    public static void main(String[] args) {
        char rol;
        String password;
        final String contraT = "queso";
        Scanner almacen = new Scanner(System.in);
        System.out.println("Ingrese como (T)rabajador o (C)liente: ");
        rol = almacen.next().charAt(0);
        rol = Character.toUpperCase(rol);
        almacen.nextLine();
        switch(rol){
            case 'C':
                System.out.println("Hola cliente");
                Cliente.main(args);
                
                break;
            case 'T':
                System.out.println("Ingrese la contrasena: ");
                password = almacen.nextLine();
                if(password.equals(contraT)){
                    Trabajador.main(args);
                }
                else{
                    System.out.println("ERROR");
                }
                break;
        }
    }
}
