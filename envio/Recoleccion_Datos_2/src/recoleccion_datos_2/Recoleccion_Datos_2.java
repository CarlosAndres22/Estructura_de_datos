/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recoleccion_datos_2;

/**
 *
 * @author Usuario
 */
import java.awt.Menu;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Optional.empty;
import javax.swing.JFrame;
/**
 *
 * @author Usuario
 */
public class Recoleccion_Datos_2 {
  
    public static String[] nombres; //declaracion vector
    public static String[] apellidos;
    public static int[] edad;
   
      public int Menu(int opcion) {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t MENU PRINCIPAL  \n\n "+
                  "1. Cargar Datos \n" +
                 
                  "4. Mostrar datos \n" +
                  "5. Salir \n"
          ));
          return opcion;
        }
      // Cargar datos
      public void cargar_nombres (){ 
          for (int i = 0; i < 10; i++) {
              nombres[i] = (JOptionPane.showInputDialog(null,"Digite un nombre, un apellido y edad."));
              
          }
    }
      
 
      
      
         public void mostrar(){
          String Datos= "LOS DATOS INGRESADOS FUERON \n ********************************************************** \n";
          
          for (int i = 0; i < 10; i++) {
              Datos += " En la posicion ["+i+"] se encuentra el nombre  " + nombres[i]  +  "\n"; 
            
          }
          JOptionPane.showMessageDialog(null,Datos);
      }
         
         
         
   
     public void salir(){
         System.exit(0); 
     }
      
  public static void main(String[] args) {
        Recoleccion_Datos_2 vec = new Recoleccion_Datos_2();
        nombres = new String[10];
        apellidos = new String[10];
        edad = new int[10];
        int op = 0;
        do {
            op = vec.Menu(op);
            switch(op){
                case 1: vec.cargar_nombres();break;
               
                case 4: vec.mostrar();break;
                case 5: vec.salir(); break;
            }
        } while(op != 0);
        
    }
    
}


