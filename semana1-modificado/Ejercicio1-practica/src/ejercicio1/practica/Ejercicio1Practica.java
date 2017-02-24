/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.practica;

import javax.swing.JOptionPane;

/**
 *
 * @author C.andres
 */
public class Ejercicio1Practica {

      public static int[] numeros; //declaracion vector
   
      public int Menu(int opcion) {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t MENU PRINCIPAL VECTORES \n\n "+
                  "1. Cargar datos \n" +
                  "2. Mostrar datos \n" +
                  "3. Buscar datos \n" +
                  "4. Actualizar datos \n" +
                  "5. Eliminar datos \n" +
                  "6. Ordenar datos \n" +
                  "7. Borrar datos \n" +
                  "8. Salir \n"
          ));
          return opcion;
        }
      // Cargar datos
      public void cargar (){
          for (int i = 0; i < 10; i++) {
              numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un dato"));
              
          }
    }
     public void buscar (){
         int buscar, cont=0 ;
         buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar:"));
         for (int i = 0; i < 10; i++) {
             if(buscar == numeros[i]){
                 JOptionPane.showMessageDialog(null, "Se encontro el dato en la posicion ["+i+"] " );
                 cont++;
             } 
         }
         if(cont == 0) {JOptionPane.showMessageDialog(null, "No se encontraron datos " );}
             else JOptionPane.showMessageDialog(null, "Se encontraron ["+cont+"] datos. " );
    } 

      
     /* IMPRIME EN VENTANAS SEPARADAS 
      public void mostrar(){
          for (int i = 0; i < 10; i++) {
              JOptionPane.showMessageDialog(null,"El dato en la posicion ["+i+"] es " + numeros[i]);
          }
      }*/
      
      // Mostrar datos en una sola ventana.
       
    
     public void mostrar(){
          String Datos="";
          for (int i = 0; i < 10; i++) {
              if(numeros[i]==0){
                  Datos += "El dato en la posicion ["+i+"] es " + numeros[i] + "\n"; 
              }  else{
                   Datos += "El dato en la posicion ["+i+"] es " + numeros[i] + "\n";  
              }
            
          }
          JOptionPane.showMessageDialog(null,Datos);
      }
      
  public static void main(String[] args) {
        Ejercicio1Practica vec = new Ejercicio1Practica();
        numeros = new int[10];
        int op = 0;
        do {
            op = vec.Menu(op);
            switch(op){
                case 1: vec.cargar();break;
                case 2: vec.mostrar();break;
                case 3: vec.buscar();break;
               
            }
        } while(op != 0);
        
    }
    
}
