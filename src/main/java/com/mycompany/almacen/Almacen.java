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
        char rol, regresar;
        int attempts;
        String password;
        final String contraT = "queso";
        Scanner almacen = new Scanner(System.in);
        
        do{
        System.out.println("Ingrese como (T)rabajador o (C)liente: ");
        rol = almacen.next().charAt(0);
        rol = Character.toUpperCase(rol);
        almacen.nextLine();
        switch(rol){
            case 'C':
                Cliente.main(args);//Te lleva al main de cliente
                break;
            case 'T':
                attempts = 0;
                do{
                System.out.println("Ingrese la contrasena: ");//La contraseña es queso
                password = almacen.nextLine();
                if(password.equals(contraT)){
                    Trabajador.main(args);
                }
                else{
                    System.out.println("ERROR");
                    attempts = attempts + 1;
                }
                if(attempts >= 5){
                    System.out.println("Ha pasado el limite de errores, intentelo mas tarde");
                }
                }while(!password.equals(contraT) && attempts < 5);
                //si pasas los 5 intentos, tendras que regresar al menu y volver a intentarlo
                break;
        }
        System.out.println("Desea regresar a la seleccion de roles (s/n)");
        regresar = almacen.next().charAt(0);
        regresar = Character.toUpperCase(regresar);
        almacen.nextLine();
        
        }while(regresar == 'S');
    }
}
