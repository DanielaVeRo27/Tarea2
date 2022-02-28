/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cliente;

/**
 *
 * @author Luisa
 */
public class Clientes {   
   private String Nombre,Apellido,Cui;
   public Clientes(String nombreClientes){      
   }           
   
   public void IngreseNombre(String Data){
      Nombre = Data;       
   }
   public void IngreseApellido(String Data){
      Apellido = Data;       
   }
   public void IngreseCui(String Data){
      Cui = Data;       
   }      
   public String NombreS() {       
       return Nombre;        
   }
   public String ApellidoS() {       
       return Apellido;        
   }
   public String CuiS() {       
       return Cui;        
   }
    
}
