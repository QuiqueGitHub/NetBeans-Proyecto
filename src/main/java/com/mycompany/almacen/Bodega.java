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
public abstract class Bodega {
    protected String direccion;
    protected Scanner bodega = new Scanner(System.in);
    
    public Bodega(){
        System.out.println("Escriba la direccion actual del producto o vehiculo: ");
        this.direccion = bodega.nextLine();
    }
    
    public Bodega(String bodega){
        this.direccion = direccion;
    }
    
    public void mostrarBodega(){
        System.out.println("Su envio partira desde:  " + this.direccion);
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the bodega
     */
    public Scanner getBodega() {
        return bodega;
    }

    /**
     * @param bodega the bodega to set
     */
    public void setBodega(Scanner bodega) {
        this.bodega = bodega;
    }
    
    
    
}
