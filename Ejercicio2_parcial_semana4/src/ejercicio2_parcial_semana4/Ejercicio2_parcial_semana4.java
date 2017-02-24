/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_parcial_semana4;

/**
 *
 * @author Usuario
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Ejercicio2_parcial_semana4 {
public static int[][] matriz;
    public int Menu(int opcion) {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t MENU PRINCIPAL MATRICES \n\n "+
                  "1. Cargar datos \n" +
                  "2. Mostrar matriz original \n" +
                  "3. Mostrar datos pedidos \n" +
                  "4. Salir \n"
          ));
          return opcion;
        }
    
    // FUNCIONES
    
    
     public void cargar (){
          for (int i = 0; i < 5; i++) {
              for (int j = 0; j < 5; j++) {
                  matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un dato"));
              }
              
              
          }
    }
      
      
       public void mostrar_original(){
          String Datos="";
          String datos2="";
          for (int i = 0; i < 5; i++) {
              for (int j = 0; j < 5; j++) {
                   if(matriz[i][j]==0){
                  Datos +=   "El dato en la posicion ["+i+"]["+j+"] es " + matriz[i][j] + "\t | \t"; 
              }  else{
                   Datos +=  "El dato en la posicion ["+i+"]["+j+"] es " + matriz[i][j] + "\t | \t"; 
                }
                  
              }
              Datos  += "\n";
            
          }
          JOptionPane.showMessageDialog(null,Datos);
      }
     
         public void mostrar(){
          String Datos="    VALORES DIAGONALES\n \n";
          
          for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){ 
                if (i == j) 
                 Datos +=   "El dato en la posicion ["+i+"]["+j+"] es " + matriz[i][j] + "\t | \t";
                
                
             } 
             Datos  += "\n";
                 
                 
           }
           
       for (int i=4; i>=0; i--) {
            for (int j=0; j<5; j++){ 
            
                if(i != j){
                    if (4-i == j) 
                 Datos +=   "El dato en la posicion ["+j+"]["+i+"] es " + matriz[j][i] + "\t | \t"; 
                }
                
                
             } 
             Datos  += "\n";
                 
                 
           }
          JOptionPane.showMessageDialog(null,Datos);
      }

     public void salir(){
         System.exit(0); 
     }
    public static void main(String[] args) {
      Ejercicio2_parcial_semana4 vec = new Ejercicio2_parcial_semana4();
        matriz = new int[5][5];
        int op = 0;
        do {
            op = vec.Menu(op);
            switch(op){
                case 1: vec.cargar();break;
                case 2: vec.mostrar_original();break;
                case 3: vec.mostrar(); break;
                case 4: vec.salir(); break;
                
                
            }
        } while(op != 0);
        
    }
    
}
