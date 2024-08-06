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
        super();//Los atributos heredados
        this.tipo = "Avion";
        avion = new Scanner(System.in);
        System.out.println("Ingrese el modelo de la aeronave: ");
        this.modelo = avion.nextLine();
        System.out.println("Cantidad de motores: ");
        this.motores = avion.nextInt();
    }
    
    public Avion(String tipo, double carga, double precio, String empresa, String matricula, String modelo, int motores){
        super("Avion", carga, precio, empresa, matricula);
        this.modelo = modelo;
        this.motores = motores;
    }
    
    @Override
    public void mostrarVehiculo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Tipo de vehiculo: " + this.tipo);
        System.out.println("Empresa: " + this.empresa);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Carga que soporta: " + this.carga + "kg");
        System.out.println("Costo por servicio: $" + this.precio);
        System.out.println("Modelo de la aeronave: " + this.modelo);
        System.out.println("Cantidad de motores: " + this.motores);
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "  Modelo de la aeronave: " + modelo + "\n" + 
               "  Motores de la aeronave: " + motores + "\n" +
               "----------------------------------------------------";
    }
    
    
}

