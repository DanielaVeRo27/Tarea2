package Transferencia;

public class Transferencias {
   
    private String CuentaO, CuentaD, Fecha, Hora; 
    private int MontoTrans=0;
    
    
    public Transferencias(String Trans){
        
    }
   public void IngreseCuentaO (String Data){ // Cuenta Origen 
       CuentaO = Data;      
   }
   public void IngreseCuentaD (String Data){ //  Cuenta Destino 
       CuentaD = Data;       
   } 
   public void IngreseFecha(String Data){ // Fecha
       Fecha = Data;       
   }
   public void IngreseHora (String Data){ // Hora
       Hora = Data;       
   }    
   public void IngreseMonto (int Data){  // Monto de Transferencia
       MontoTrans = Data;       
   } 
   public int MontoS() {       
       return MontoTrans;        
   }
   public String CuentaOS() {       
       return CuentaO;        
   }
   public String CuentaDS() {       
       return CuentaD;        
   }
   public String FechaS() {       
       return Fecha;        
   }   
   public String HoraS(){
       return Hora;
   }
}
