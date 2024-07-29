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
    
    public Avion(String direccion, double carga, double ruta, double presupuesto, String empresa, String matricula, int personal, String modelo, int motores){
        super(direccion, carga, ruta, presupuesto, empresa, matricula, personal);
        this.modelo = modelo;
        this.motores = motores;
    }
    
    public void mostrarAvion(){
        mostrarTransporte();
        System.out.println("Modelo del avion: " + this.modelo);
        System.out.println("Cantidad de motores: " + this.motores);  
    }
    
    public void AvionBasico(){
        TransporteBasico();
        System.out.println("Sera enviado en un: " + this.modelo);
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

