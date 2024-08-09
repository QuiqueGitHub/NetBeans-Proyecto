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
    
    public Avion(String tipo, double carga, long precio, String empresa, String matricula, String modelo, int motores){
        super("Avion", carga, precio, empresa, matricula);
        this.modelo = modelo;
        this.motores = motores;
    }
    
    @Override
    public void mostrarVehiculo(){
        System.out.println("----------------------------------------------------");
        System.out.println("Tipo de vehiculo: " + this.getTipo());
        System.out.println("Empresa: " + this.getEmpresa());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Carga que soporta: " + this.getCarga() + "kg");
        System.out.println("Costo por servicio: $" + this.getPrecio());
        System.out.println("Modelo de la aeronave: " + this.modelo);
        System.out.println("Cantidad de motores: " + this.motores);
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + 
               "  Modelo de la aeronave: " + getModelo() + "\n" + 
               "  Motores de la aeronave: " + getMotores() + "\n" +
               "----------------------------------------------------";
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the motores
     */
    public int getMotores() {
        return motores;
    }

    /**
     * @param motores the motores to set
     */
    public void setMotores(int motores) {
        this.motores = motores;
    }

    /**
     * @return the avion
     */
    public Scanner getAvion() {
        return avion;
    }

    /**
     * @param avion the avion to set
     */
    public void setAvion(Scanner avion) {
        this.avion = avion;
    }
    
    
}

