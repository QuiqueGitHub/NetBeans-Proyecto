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
public abstract class Transporte extends Bodega{
    protected double carga;
    protected double ruta;
    protected double presupuesto;
    protected String empresa;
    protected String matricula;
    protected int personal;
    protected Scanner transporte;
     
    public Transporte(){
        transporte = new Scanner(System.in);
        System.out.println("Ingrese la carga que soporta en kg: ");
        this.carga = transporte.nextDouble();
        System.out.println("Ingrese la ruta en km que cursara: ");
        this.ruta = transporte.nextDouble();
        System.out.println("Ingrese el presupuesto para el viaje: ");
        this.presupuesto = transporte.nextDouble();
        transporte.nextLine();
        System.out.println("A que empresa pertenece el transporte: ");
        this.empresa = transporte.nextLine();
        System.out.println("No. de serie: ");
        this.matricula = transporte.nextLine();
        System.out.println("Cantidad de personal: ");
        this.personal = transporte.nextInt();

    }
    
    public Transporte(String direccion, double carga, double ruta, double presupuesto, String empresa, String matricula, int personal){
        super(direccion);
        this.carga = carga;
        this.ruta = ruta;
        this.presupuesto = presupuesto;
        this.empresa = empresa;
        this.matricula = matricula;
        this.personal = personal;
               
    }
    
    public void mostrarTransporte(){
        mostrarBodega();
        System.out.println("Carga que soporta " + this.getCarga() + " kg");
        System.out.println("Distancia a recorrer " + this.getRuta() + " km");
        System.out.println("Gastos de transporte: $ " + this.getPresupuesto());
        System.out.println("Empresa: " + this.getEmpresa());
        System.out.println("No. de serie:  " + this.getMatricula());
        System.out.println("Personal que transporta: " + this.getPersonal());
    }
    
    public void TransporteBasico(){
        mostrarBodega();
        System.out.println("Sera enviado por: " + this.getEmpresa());
        System.out.println("La matricula es: " + this.getMatricula());
        System.out.println("Su envio recorrera: " + this.getRuta() + " km");
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
     * @return the ruta
     */
    public double getRuta() {
        return ruta;
    }

    /**
     * @param ruta the ruta to set
     */
    public void setRuta(double ruta) {
        this.ruta = ruta;
    }

    /**
     * @return the presupuesto
     */
    public double getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
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
     * @return the personal
     */
    public int getPersonal() {
        return personal;
    }

    /**
     * @param personal the personal to set
     */
    public void setPersonal(int personal) {
        this.personal = personal;
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
