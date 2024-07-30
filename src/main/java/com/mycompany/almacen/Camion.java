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
public class Camion extends Transporte {
    private int remolques;
    private int casetas;
    private Scanner camion;
    
    public Camion(){
        camion = new Scanner(System.in);
        System.out.println("Con cuantos remolques cuenta: ");
        this.remolques = camion.nextInt();
        System.out.println("Cuantas casetas cruzara: ");
        this.casetas = camion.nextInt();
    }
    
    public Camion(String tipo, double carga, double presupuesto, String empresa, String matricula, int remolques, int casetas){
        super(tipo, carga, presupuesto, empresa, matricula);
        this.remolques = remolques;
        this.casetas = casetas;
    }
    
}

