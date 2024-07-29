/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.almacen;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author kike0
 */
public class Almacen {

    public static void main(String[] args) {
        char menu;
        int op, i;
        Scanner registro = new Scanner(System.in);
        Scanner accion = new Scanner(System.in);
        Scanner envio = new Scanner(System.in);
        Scanner folio = new Scanner(System.in);
        List<Registro> inventario = new LinkedList<>();
        List<Avion> aviones = new LinkedList<>();
        List<Camion> camiones = new LinkedList<>();
        List<Barco> barcos = new LinkedList();
        
        
        do{
           
            System.out.println("1) Registrar envio: ");
            System.out.println("2) Registrar transportes: ");
            System.out.println("3) Mostrar ordenes de envio: ");
            System.out.println("4) Mostrar fichas de transportes: ");
            System.out.println("5) Enviar pedidos: ");
            op = accion.nextInt();
            switch(op){
                case 1:
                    inventario.add(new Registro());
                    break;
                case 2:
                    System.out.println("Que transporte quiere registrar (A)vion, (C)amion, (B)arco: ");
                    char transporte = envio.next().charAt(0);
                    if(transporte == 'a' || transporte == 'A'){
                        aviones.add(new Avion());
                    }
                    if(transporte == 'c' || transporte == 'C'){
                        camiones.add(new Camion());
                    }
                    if(transporte == 'b' || transporte == 'B'){
                        barcos.add(new Barco());
                    }
                    break;
                case 3:
                    if(inventario.isEmpty()){
                        System.out.println("No hay envios registrados por el momento ");
                    }
                    for(i = 0; i < inventario.size(); i++){
                        System.out.println("**************************************");
                        System.out.println("Folio de orden: " + inventario.get(i).getFolio());
                        System.out.println("Fecha de orden: " + inventario.get(i).getDia() + "/" + inventario.get(i).getMes() + "/" + inventario.get(i).getAnio());
                        System.out.println("Se recibio a: " + inventario.get(i).getHora() + ":" + inventario.get(i).getMin());
                        System.out.println("Producto: " + inventario.get(i).getProducto());
                        System.out.println("Marca: " + inventario.get(i).getMarca());
                        System.out.println("**************************************");
                    }
                    System.out.println(" ");
                    break;
                case 4:
                    if(camiones.isEmpty()){
                        System.out.println("No hay camiones disponibles por el momento ");
                    }
                    else{
                      System.out.println("Camiones disponibles: ");
                      for(i = 0; i < camiones.size(); i++){
                        System.out.println("**************************************");
                        System.out.println("Empresa: " + camiones.get(i).getEmpresa());
                        System.out.println("Matricula del vehiculo: " + camiones.get(i).getMatricula());
                        System.out.println("Remolques: " + camiones.get(i).getRemolques());
                        System.out.println("**************************************");
                    }
                        System.out.println(" ");  
                    }
                    if(aviones.isEmpty()){
                        System.out.println("No hay aviones disponibles por el momento ");
                    } 
                    else{
                       System.out.println("Aviones disponibles: ");
                        for(i = 0; i < aviones.size(); i++){
                            System.out.println("**************************************");
                            System.out.println("Empresa: " + aviones.get(i).getEmpresa());
                            System.out.println("Matricula del vehiculo: " + aviones.get(i).getMatricula());
                            System.out.println("Modelo de aeronave: " + aviones.get(i).getModelo());
                            System.out.println("Motores de aeronave: " + aviones.get(i).getMotores());
                            System.out.println("**************************************");
                    }
                        System.out.println(" "); 
                    }
                    if(barcos.isEmpty()){
                        System.out.println("No hay barcos disponibles por el momento ");
                    } 
                    else{
                        System.out.println("Barcos disponibles: ");
                        for(i = 0; i < barcos.size(); i++){
                            System.out.println("**************************************");
                            System.out.println("Empresa: " + barcos.get(i).getEmpresa());
                            System.out.println("Matricula del vehiculo: " + barcos.get(i).getMatricula());
                            System.out.println("Puerto destino: " + barcos.get(i).getBanderaD());
                            System.out.println("Contenedores a bordo: " + barcos.get(i).getContenedores());
                            System.out.println("**************************************");
                        }  
                    }
                    break;
                case 5:
                    if(inventario.isEmpty()){
                        System.out.println("No hay ordenes de envio registradas");
                    }
                    if(camiones.isEmpty() && aviones.isEmpty() && barcos.isEmpty()){
                        System.out.println("No hay transportes disponibles para hacer la entrega");
                    }
                    else{
                        System.out.println("Escriba el folio del envio que quiere procesar: ");
                        String proceEnvio = folio.nextLine();
                        System.out.println("Escriba la matricula del vehiculo que quiere usar: ");
                        String proceMatricula = folio.nextLine();
                        for(i = 0; i < inventario.size(); i++){
                            if(inventario.get(i).getFolio().equals(proceEnvio)){
                                inventario.remove(inventario.get(i));
                                break;
                            }
                        }
                        for(i = 0; i < aviones.size(); i++){
                            if(aviones.get(i).getMatricula().equals(proceMatricula)){
                                aviones.remove(aviones.get(i));
                                break;
                            }
                        }
                        for(i = 0; i < camiones.size(); i++){
                            if(camiones.get(i).getMatricula().equals(proceMatricula)){
                                camiones.remove(camiones.get(i));
                                break;
                            }
                        }
                        for(i = 0; i < barcos.size(); i++){
                            if(barcos.get(i).getMatricula().equals(proceMatricula)){
                                barcos.remove(barcos.get(i));
                                break;
                            }
                        }
                        System.out.println("Envio con folio: " + proceEnvio + " Ha sido enviado en el vehiculo con matricula: " + proceMatricula);
                        System.out.println("Pedidos registrados: " + inventario.size());
                        System.out.println("Aviones disponibles: " + aviones.size());
                        System.out.println("Camiones disponibles: " + camiones.size());
                        System.out.println("Barcos disponibles: " + barcos.size());
                    }
                    
                    break;
                default:
                    System.out.println("ERROR ");

            }
            System.out.println("Desea volver al menu (s/n): ");
            menu = registro.next().charAt(0);         
        }while(menu == 's' || menu == 'S');

    }
}
