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
    
    public Camion(String direccion, double carga, double ruta, double presupuesto, String empresa, String matricula, int personal, int remolques, int casetas){
        super(direccion, carga, ruta, presupuesto, empresa, matricula, personal);
        this.remolques = remolques;
        this.casetas = casetas;
    }
    
    public void mostrarCamion(){
        mostrarTransporte();
        System.out.println("Remolques: " + this.remolques);
        System.out.println("Casetas en ruta: " + this.casetas); 
    }
    
    public void CamionBasico(){
        TransporteBasico();
        System.out.println("Su envio recorrera: " + this.casetas + " casetas");
    }

    /**
     * @return the remolques
     */
    public int getRemolques() {
        return remolques;
    }

    /**
     * @param remolques the remolques to set
     */
    public void setRemolques(int remolques) {
        this.remolques = remolques;
    }

    /**
     * @return the casetas
     */
    public int getCasetas() {
        return casetas;
    }

    /**
     * @param casetas the casetas to set
     */
    public void setCasetas(int casetas) {
        this.casetas = casetas;
    }

    /**
     * @return the camion
     */
    public Scanner getCamion() {
        return camion;
    }

    /**
     * @param camion the camion to set
     */
    public void setCamion(Scanner camion) {
        this.camion = camion;
    }
    
    
    
}

