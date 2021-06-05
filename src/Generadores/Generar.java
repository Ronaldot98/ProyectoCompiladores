/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generadores;

import java.io.IOException;

/**
 *
 * @author Ronal
 */
public class Generar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
         try{
                                                                                                                                                     //GeneradorSintactico
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" cd C:\\Users\\Ronal\\Documents\\NetBeansProjects\\Proyecto_Compiladores\\src\\Generadores && GeneradorSintactico.bat");
    }   catch (IOException ex) {
         
        }
        
    }
    
}
