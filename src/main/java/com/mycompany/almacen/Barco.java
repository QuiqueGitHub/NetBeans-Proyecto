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
public class Barco extends Transporte {
    private int contenedores;
    
    private Scanner barco;
    
    public Barco(){
        barco = new Scanner(System.in);
        System.out.println("Cuantos contenedores transporta: ");
        this.contenedores = barco.nextInt();
        
      
    }
    
     public Barco(String tipo, double carga, double presupuesto, String empresa, String matricula, int contendores){
        super(tipo, carga, presupuesto, empresa, matricula);
        this.contenedores = contenedores;
       
    }
     
    
}
