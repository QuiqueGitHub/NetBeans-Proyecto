/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;

import java.util.Scanner;

/**
 *
 * @author kike0
 */
public class Ficha{
    
    Scanner almacen = new Scanner(System.in);
        
    public Ficha (){
        Registro r1 = new Registro();
        System.out.println("Que transporte desea resgitrar (A)vion, (C)amion, (B)arco: ");
        char transporte = almacen.next().charAt(0); 
        if(transporte == 'A' || transporte == 'a'){
            Avion a1 = new Avion();
            System.out.println("Ficha de envio: ");
            r1.RegistroBasico();
            a1.AvionBasico();
        }
        if(transporte == 'C' || transporte == 'c'){
            Camion c1 = new Camion();
            System.out.println("Ficha de envio: ");
            r1.RegistroBasico();
            c1.CamionBasico();
        }
        if(transporte == 'B' || transporte == 'b'){
            Barco b1 = new Barco();
            System.out.println("Ficha de envio: ");
            r1.RegistroBasico();
            b1.BarcoBasico();
        }
           
    }
    
    
        
}
