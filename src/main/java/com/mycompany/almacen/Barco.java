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
    private String banderaD;
    private Scanner barco;
    
    public Barco(){
        barco = new Scanner(System.in);
        System.out.println("Cuantos contenedores transporta: ");
        this.contenedores = barco.nextInt();
        barco.nextLine();
        System.out.println("A donde llega: ");
        this.banderaD = barco.nextLine();
    }
    
     public Barco(String direccion, double carga, double ruta, double presupuesto, String empresa, String matricula, int personal, int contendores, String banderaO, String banderaD){
        super(direccion, carga, ruta, presupuesto, empresa, matricula, personal);
        this.contenedores = contenedores;
        this.banderaD = banderaD;
    }
     
     public void mostrarBarco(){
         mostrarTransporte();
         System.out.println("Contendores a bordo: " + this.getContenedores());
         System.out.println("Llegara a : " + this.banderaD);  
     }
     public void BarcoBasico(){
        TransporteBasico(); 
        System.out.println("Llegara a: " + this.banderaD);
         
     }

    /**
     * @return the contenedores
     */
    public int getContenedores() {
        return contenedores;
    }

    /**
     * @param contenedores the contenedores to set
     */
    public void setContenedores(int contenedores) {
        this.contenedores = contenedores;
    }

    /**
     * @return the banderaD
     */
    public String getBanderaD() {
        return banderaD;
    }

    /**
     * @param banderaD the banderaD to set
     */
    public void setBanderaD(String banderaD) {
        this.banderaD = banderaD;
    }

    /**
     * @return the barco
     */
    public Scanner getBarco() {
        return barco;
    }

    /**
     * @param barco the barco to set
     */
    public void setBarco(Scanner barco) {
        this.barco = barco;
    }
    
     
     
}
