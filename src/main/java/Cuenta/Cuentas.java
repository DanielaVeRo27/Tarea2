/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

/**
 *
 * @author Luisa
 */
public class Cuentas {
   private String TipoC,CuiC,IdC;
   private int FondoC;   
   public Cuentas(String nombreCuentas){      
   }           
   
   public void IngreseTipo(String Data){
      TipoC = Data;       
   }
   public void IngreseCui(String Data){
      CuiC = Data;       
   }
   public void IngreseID(String Data){
      IdC = Data;       
   }      
   public String TipoS() {       
       return TipoC;        
   }
   public String CuiS() {       
       return CuiC;        
   }
   public String IdS() {       
       return IdC;        
   }
   public void Fondo(int Data){
      FondoC = Data;       
   }      
   public int FondoS() {       
       return FondoC;        
   }
   
       
}
