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
public class Avion  extends Transporte{
    private String modelo;
    private int motores;
    private Scanner avion;
    
    public Avion(){
        avion = new Scanner(System.in);
        System.out.println("Ingrese el modelo de la aeronave: ");
        this.modelo = avion.nextLine();
        System.out.println("Cantidad de motores: ");
        this.motores = avion.nextInt();
    }
    
    public Avion(String tipo, double carga, double presupuesto, String empresa, String matricula, int personal, String modelo, int motores){
        super(tipo, carga, presupuesto, empresa, matricula);
        this.modelo = modelo;
        this.motores = motores;
    }
    
    
}

