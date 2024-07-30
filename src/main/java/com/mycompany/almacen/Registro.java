/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;
import java.util.Scanner;

public class Registro{
    private Tiempo hora;
    private Tiempo fecha;
    private Tiempo folio;
    private float peso;
    private long presupuesto;
    private int mercancia;
    private String producto;
    private String marca;
    private String origen;
    private String destino; 
    private float pesof;

    public Registro() {
        Scanner entrada = new Scanner(System.in);
        this.setFecha(new Tiempo());
        this.setHora(new Tiempo());
        this.setFolio(new Tiempo());
        System.out.print("Que desea transportar: ");
        producto = entrada.next();
        System.out.print("Ingrese la marca del producto: ");
        marca = entrada.next();
        System.out.print("Ingrese el peso de su producto por unidad (en kg): ");
        peso = entrada.nextFloat();
        System.out.print("Ingrese la cantidad de su producto: ");
        mercancia = entrada.nextInt();
        System.out.print("Cual es su presupuesto para el traslado: ");
        presupuesto =entrada.nextLong();
        entrada.nextLine();
        System.out.print("Desde donde saldra su envio: ");
        origen =entrada.nextLine();
        System.out.print("A donde llegara: ");
        destino =entrada.nextLine();
        
        this.pesof = this.peso * this.mercancia;
    }
    
    public Registro(Tiempo hora, Tiempo fecha, Tiempo folio, long presupuesto, float peso, int mercancia, String producto, String marca, String origen, String destino, float pesof){
    this.hora = hora;
    this.fecha = fecha;
    this.folio = folio;
    this.presupuesto = presupuesto;
    this.peso = peso;
    this.mercancia = mercancia;
    this.producto = producto; 
    this.marca = marca;
    this.origen = origen;
    this.destino = destino;
    this.pesof = this.peso * this.mercancia;
    }
    
    public void mostrarOrden(){
        System.out.println("----------------------------------------------------");
        System.out.println("Folio de orden: " );
        getFolio().mostrarFolio();
        System.out.println("Fecha de registro: ");
        getFecha().mostrarFecha();
        System.out.println("Hora de registro: ");
        getHora().mostrarHora();
        System.out.println("Saldra de: " + this.origen);
        System.out.println("Llegara a: " + this.destino);
        System.out.println("Producto a transportar: " + this.producto);
        System.out.println("Marca del prodcuto: " + this.marca);
        System.out.println("Peso de la carga: " + this.pesof + "kg");
        System.out.println("Presupuesto: $" + this.presupuesto);
        System.out.println("----------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return "--------------------------------------------------------------------\n" +
               "  Datos de la orden: " + "\n" +
               "  Nombre de cuenta: " + NombresCuentas.CuentaNombre + "\n" + folio + "\n" +
               "  Saldra de: " + origen + "\n" +
               "  Llegara a: " + destino + "\n" +
               "  Producto a transportar: " + mercancia + "\n" +
               "  Marca de procuto: " + producto + "\n" +
               "  Peso de la carga: " + pesof + "\n" +
               "  Presupuesto: $" + presupuesto + "\n" +
               "---------------------------------------------------------------------"
             ;
}

    /**
     * @return the hora
     */
    public Tiempo getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Tiempo hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public Tiempo getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Tiempo fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the folio
     */
    public Tiempo getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(Tiempo folio) {
        this.folio = folio;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
        this.pesof = this.peso * this.mercancia; // Recalcular pesof si se cambia el peso
    }

    /**
     * @return the presupuesto
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(long presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * @return the mercancia
     */
    public int getMercancia() {
        return mercancia;
    }

    /**
     * @param mercancia the mercancia to set
     */
     public void setMercancia(int mercancia) {
        this.mercancia = mercancia;
        this.pesof = this.peso * this.mercancia; // Recalcular pesof si se cambia la mercancia
    }

    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the pesof
     */
    public float getPesof() {
        return pesof;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

}
