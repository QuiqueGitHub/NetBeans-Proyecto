/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.almacen;
import java.util.Scanner;

public class Registro extends Bodega{
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int min;
    private String folio;
    private float precio;
    private float peso;
    private int mercancia;
    private String producto;
    private String marca;
    private float preciof;
    private float pesof;

    public Registro() {
        Scanner entrada = new Scanner(System.in);
        boolean fechaValida = false;

        while (! fechaValida){
        System.out.println("Ingrese el dia: ");
        this.dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        this.mes = entrada.nextInt();
        System.out.println("Ingrese el anio: ");
        this.anio = entrada.nextInt();
        if (validarFecha()){
           fechaValida = true;
        }else{
            System.out.print("La fecha ingresada no es valida. Por favor intentalo de nuevo.\n");
        }
    }       
        System.out.println("Ingrese la hora: ");
        this.hora = entrada.nextInt();
        System.out.println("Ingrese los minutos: ");
        this.min = entrada.nextInt();
        entrada.nextLine();  // Consumir el salto de línea
        System.out.print("Que desea transportar: ");
        producto=entrada.next();
        System.out.print("Ingrese la marca del producto: ");
        marca=entrada.next();
        System.out.print("Ingrese el precio del producto por unidad: ");
        precio=entrada.nextFloat();
        System.out.print("Ingrese el peso de su producto por unidad (en gramos): ");
        peso=entrada.nextFloat();
        System.out.print("Ingrese la cantidad de su producto: ");
        mercancia=entrada.nextInt();
        this.folio = generarFolio();
    }
    
    public Registro(String direccion, int dia, int mes, int anio, int hora, int min, String folio, float precio, float peso, int mercacia, String producto, String marca, float preciof, float pesof){
    super(direccion);
    
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
    this.hora = hora;
    this.min = min;
    this.folio = folio;
    this.precio = precio;
    this.peso = peso;
    this.mercancia = mercancia;
    this.producto = producto; 
    this.marca = marca;
    this.preciof = preciof;
    this.pesof = pesof;
        
    }
      
        

    public void mostrarRegistro() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String mesString = (getMes() >= 1 && getMes() <= 12) ? meses[getMes() - 1] : "Mes inválido";

        System.out.println("La fecha de su Compra es: " + this.getDia() + " de " + mesString + " de " + getAnio());
        System.out.println("Hora de su compra: " + getHora()+":"+getMin());
        System.out.println("Su folio es: " + getFolio());
        System.out.println("Precio de su producto: $" + this.getPrecio());
        System.out.println("Peso de su Producto: " + this.getPeso());
        System.out.println("Se transportaran: " + this.getMercancia() + " " + this.getProducto() + " de la marca " + this.getMarca());
        System.out.println("Valor de la carga: $" + this.preciof);
        System.out.println("Peso de la carga: " + this.pesof );
        
    }
    
    public void RegistroBasico(){
        System.out.println("Fecha de compra: " + this.getDia() + " de " + this.getMes() + " de " + this.getAnio());
        System.out.println("Hora de orden: "+ this.getHora() + ":" + this.getMin());
        System.out.println("Folio: " + this.getFolio());
        System.out.println("Producto: " + this.getProducto());
        System.out.println("Marca del producto: " + this.getMarca());
    }

    public final boolean validarFecha(){
    if (getMes() < 1 || getMes() > 12)return false;
    if (getDia() < 1)return false;
    if( getMes() == 2){
        if(esBisiesto(getAnio())){
            return getDia() <=29;
        }else{
        return  getDia() <= 28;
 }
 }
 if (   getMes() == 4 || getMes() == 6 || getMes() == 9 || getMes() == 11){
     return getDia() <=30;
 }
 return getDia() <= 31;  
}
private boolean esBisiesto(int anio){
    return (anio % 4 == 0 && anio % 100 != 0)||(anio % 400 == 0);
}
private String generarFolio() {
    String diaString=String.valueOf(getDia());
    String mesString=String.valueOf(getMes());
    String anioString=String.valueOf(getAnio());
    String horaString=String.valueOf(getHora());
    String minString=String.valueOf(getMin());
    return diaString+mesString+anioString+horaString+minString;
}

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the folio
     */
    public String getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
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
     * @return the preciof
     */
    public float getPreciof() {
        return preciof;
    }

    /**
     * @param preciof the preciof to set
     */
    public void setPreciof(float preciof) {
        this.preciof = preciof;
    }

    /**
     * @return the pesof
     */
    public float getPesof() {
        return pesof;
    }

    /**
     * @param pesof the pesof to set
     */
    public void setPesof(float pesof) {
        this.pesof = pesof;
    }
  

    



}
