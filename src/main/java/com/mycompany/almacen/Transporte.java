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
    protected Scanner transporte;
    protected double presupuesto;
     
    public Transporte(){
        transporte = new Scanner(System.in);
        System.out.println("Ingrese el tipo de transporte (Avion/Camion/Barco): ");
        this.tipo = transporte.nextLine();
        System.out.println("Ingrese la carga que soporta en kg: ");
        this.carga = transporte.nextDouble();
        transporte.nextLine();
        System.out.println("A que empresa pertenece el transporte: ");
        this.empresa = transporte.nextLine();
        System.out.println("Matricula: ");
        this.matricula = transporte.nextLine();
    }
    
    public Transporte(String tipo, double carga, double presupuesto, String empresa, String matricula){
        this.tipo = tipo;
        this.carga = carga;
        this.presupuesto = presupuesto;
        this.empresa = empresa;
        this.matricula = matricula;
    }
    
    public void mostrarTransporte(){
        
    }
    
    
}
