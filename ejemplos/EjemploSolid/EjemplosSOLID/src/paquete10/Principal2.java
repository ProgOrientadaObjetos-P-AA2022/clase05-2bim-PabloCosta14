/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.ObjectInputStream;

/**
 *
 * @author SALA I
 */
public class Principal2 {
     private ObjectInputStream entrada;
     private String nombreArchivo;
     
     
     public Principal2(String n){
         nombreArchivo = n;
         
         
     }
     
   
    
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
}
