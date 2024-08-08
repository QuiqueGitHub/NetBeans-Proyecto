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
public abstract class Transporte{
    protected double carga;
    protected String empresa;
    protected String matricula;
    protected String tipo;
    protected long precio;
    protected Scanner transporte;
     
    public Transporte(){
        transporte = new Scanner(System.in);
        System.out.println("Ingrese la carga que soporta (en kg): ");
        this.carga = transporte.nextDouble();
        transporte.nextLine();
        System.out.println("A que empresa pertenece el transporte: ");
        this.empresa = transporte.nextLine();
        System.out.println("Matricula: ");
        this.matricula = transporte.nextLine();
        System.out.println("Costo por sevicio: ");
        this.precio = transporte.nextLong();
    }
    
    public Transporte(String tipo, double carga, long precio, String empresa, String matricula){
        this.tipo = tipo;
        this.carga = carga;
        this.precio = precio;
        this.empresa = empresa;
        this.matricula = matricula;
        
    }
    
    public abstract void mostrarVehiculo();
    
    // Método sobrescrito toString
    @Override
    public String toString() {
        return "---------------------------------------------------------------" + "\n" +
               "  Tipo de vehiculo: " + getTipo() + "\n" + 
               "  Empresa duena del vehiculo: " + getEmpresa() + "\n" + 
               "  Matricula del vehiculo: " + getMatricula() + "\n" +
               "  Carga que soporta: " + getCarga() + "kg" + "\n" + 
               "  Precio por uso del vehiculo: $" + getPrecio();
    }

    /**
     * @return the carga
     */
    public double getCarga() {
        return carga;
    }

    /**
     * @param carga the carga to set
     */
    public void setCarga(double carga) {
        this.carga = carga;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precio
     */
    public long getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(long precio) {
        this.precio = precio;
    }

    /**
     * @return the transporte
     */
    public Scanner getTransporte() {
        return transporte;
    }

    /**
     * @param transporte the transporte to set
     */
    public void setTransporte(Scanner transporte) {
        this.transporte = transporte;
    }
    
    
}
