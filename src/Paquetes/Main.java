package Paquetes;

import java.io.File;


public class Main {
    
public static void main(String[] args) 
    {
        
        Vista vista = new Vista();
         vista.setVisible(true);
        String rutaFlex="C:/Users/Ronal/Documents/NetBeansProjects/Proyecto_Compiladores/src/Paquetes/Lexer.flex";       
        generarLexer(rutaFlex);
    }
    
 
    public static void generarLexer(String ruta)
    {
    File archivo = new File(ruta);
    jflex.Main.generate(archivo);   
    }

}
