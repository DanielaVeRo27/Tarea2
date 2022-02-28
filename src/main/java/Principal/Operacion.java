/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import java.util.Scanner;
import Cliente.Clientes;
import Cuenta.Cuentas;
import Transferencia.Transferencias;
/**
 *
 * @author Luisa
 */


public class Operacion {
   static Scanner entrada = new Scanner(System.in); 
   static Scanner entradaint = new Scanner(System.in); 
   static Cuentas[] Cuenta = new Cuentas[100]; 
   static Clientes[] Client = new Clientes[100]; 
   static Transferencias[] Trans = new Transferencias[100];
   static String cantidad;  
   static boolean igual; 
   static int Final = 0,NoCliente = 0,NoCuenta = 0,ClienteVer,FondoC, NoTrans=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       while (Final < 5 ) {
          igual = false;
          System.out.println("Ingres Nombre del Cliente = ");                       
          cantidad = entrada.nextLine();    
          Client[NoCliente] = new Clientes("");
          Client[NoCliente].IngreseNombre(cantidad);
          System.out.println("Ingres Apellido del Cliente = ");                       
          cantidad = entrada.nextLine();    
          Client[NoCliente].IngreseApellido(cantidad);
          System.out.println("Ingres CUI deL Cliente = ");                       
          cantidad = entrada.nextLine();    
          Client[NoCliente].IngreseCui(cantidad);        
          if (NoCliente != 0) { 
             System.out.println("Entrando a If"); 
             for (int j = 0;j<=(NoCliente-1);j++){                
                if (cantidad.equals(Client[j].CuiS())) {
                   igual = true;                  
                   System.out.println("Cliente Existente "+ String.valueOf(cantidad) );
                }                  
             } 
             if (igual==false) {
               NoCliente = NoCliente + 1;  
               System.out.println("Cliente Guardado w "+ String.valueOf(NoCliente) );
             }
          } else {
               NoCliente = NoCliente + 1; 
               System.out.println("Cliente Guardado"+ String.valueOf(NoCliente));                 
          }         
                      
          System.out.println("Desea ingresar otro registro?");                       
          cantidad = entrada.nextLine();    
          if (cantidad.equals("no")){
             Final = 6; 
          }
          
    }       
    System.out.println("Que numero de cliente quiere ver");       
    ClienteVer = entradaint.nextInt(); 
    
    System.out.println(Client[ClienteVer].NombreS()+" "+Client[ClienteVer].ApellidoS());       
        // TODO code application logic here
        
        
        
        
        
        
    Final = 0;    
    while (Final < 5 ) {
          igual = false;
          Cuenta[NoCuenta] = new Cuentas("");          
          System.out.println("Ingrese Tipo de Cuenta = ");                       
          cantidad = entrada.nextLine();       
          Cuenta[NoCuenta].IngreseTipo(cantidad);
          System.out.println("Tipo de Cuenta = "+Cuenta[NoCuenta].TipoS());                       
          
          System.out.println("Ingrese Cui del Cliente = ");                       
          cantidad = entrada.nextLine();              
          Cuenta[NoCuenta].IngreseCui(cantidad);
          
          if (NoCliente != 0) { 
             System.out.println("Entrando a If"); 
             for (int j = 0;j<=(NoCliente-1);j++){                
                if (cantidad.equals(Client[j].CuiS())) {
                   igual = true;                  
                   System.out.println("Cliente Existente "+ String.valueOf(cantidad) );
                }                  
             } 
             if (igual==false) {               
               System.out.println("Cliente No Registrado "+ String.valueOf(NoCliente) );
               System.out.println("Desea ingresar otro Cui?");
               cantidad = entrada.nextLine();   
             }
          } else {               
               System.out.println("No existen Clientes");               
          }                             
                                          
          if (cantidad.equals("si")){
             Final = 4; 
          }                  
          if (igual){                            
             System.out.println("Ingrese Identificador de Cuenta = ");                       
             cantidad = entrada.nextLine();              
             Cuenta[NoCuenta].IngreseID(cantidad);
             System.out.println("Ingrese Fondos ");                       
             FondoC = entradaint.nextInt();             
             Cuenta[NoCuenta].Fondo(FondoC);                                                                                                                 
             if (NoCuenta != 0) { 
                System.out.println("Entrando a If Fondo" + String.valueOf(cantidad)); 
                for (int j = 0;j<=(NoCuenta-1);j++){                
                   if (cantidad.equals(Cuenta[j].IdS())) {
                      igual = true;                  
                      System.out.println("Cuenta Existente "+ String.valueOf(cantidad) );
                   }                  
                } 
                if (igual==false) {
                  NoCuenta = NoCuenta + 1;  
                  System.out.println("Cuenta Guardada w "+ String.valueOf(NoCuenta) );
                }
             } else {
                  NoCuenta = NoCuenta + 1; 
                  System.out.println("Cuenta Guardada"+ String.valueOf(NoCuenta));                 
             }         
                      
             System.out.println("Desea ingresar otro registro?");                       
             cantidad = entrada.nextLine();                
             if (cantidad.equals("no")){
                Final = 6; 
             }
          }
    } 
    System.out.println("Que numero de cuenta quiere ver?");       
    ClienteVer = entradaint.nextInt(); 
    
    System.out.println(Cuenta[ClienteVer].TipoS()+" "+Cuenta[ClienteVer].IdS()+"  "+Cuenta[ClienteVer].CuiS()+String.valueOf(Cuenta[ClienteVer].FondoS()));         
   
    
    
    Final = 0;    
    while (Final < 5 ) {
          igual = false;
          Trans[NoTrans] = new Transferencias ("");          
          System.out.println("Ingrese Cuenta Origen = ");                       
          cantidad = entrada.nextLine();       
          Trans[NoTrans].IngreseCuentaO(cantidad);
          System.out.println(" Cuenta Origen=  "+Trans[NoTrans].CuentaOS());  
          
          if (NoCuenta != 0) { 
             System.out.println("Entrando a If"); 
             for (int j = 0;j<=(NoCuenta-1);j++){
                 System.out.println("hola");
                 if (cantidad.equals(Cuenta[j].IdS())) {
                   igual = false;                  
                   System.out.println(" Cuenta Existente "+ String.valueOf(cantidad) );
                }
                 else {
                     igual =true;
                     System.out.println("La cuenta no existe ");
                 }
                     
                if (igual==false) {
                  NoTrans ++;  
                  System.out.println("Cuenta Guardada w "+ String.valueOf(NoTrans)+ "False" );
                }
              else {
                     System.out.println("Desea Ingresar otra cuenta ");
                     cantidad = entrada.nextLine();   
                     
                     System.out.println(" Ya me perdi hasta aqui llego funcional el programa de la tarea comlo ");
             }                     
                     
                     
                     
                     
                 }    
             } 
          }
          
          
          System.out.println("Ingrese Cuenta de Destino =  ");                       
          cantidad = entrada.nextLine();              
          Trans[NoTrans].IngreseCuentaD(cantidad);
          System.out.println(" Cuenta Destino =  "+Trans[NoTrans].CuentaDS());
          
          /**
           * System.out.println("Ingrese Cuenta de Destino =  ");                       
          cantidad = entrada.nextLine();              
          Trans[NoTrans].IngreseCuentaD(cantidad);
          System.out.println(" Cuenta Destino =  "+Trans[NoTrans].CuentaDS());   
          */ 
    
          
    }
    
    
    
    
    
    }
    
    
    
    

    
}
