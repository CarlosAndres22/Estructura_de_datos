/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package original;

import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author C.andres
 */
public class Original {

    public static int[] numeros; //declaracion vector
   
      public int Menu(int opcion) {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t MENU PRINCIPAL VECTORES \n\n "+
                  "1. Cargar datos \n" +
                  "2. Mostrar datos \n" +
                  "3. Buscar datos \n" +
                  "4. Modificar datos \n" +
                  "5. Eliminar datos \n" +
                  "6. Ordenar datos \n" +
                  "7. Borrar vector \n" +
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
      
      
         public void mostrar(){
          String Datos="";
          for (int i = 0; i < 10; i++) {
                  Datos += "El dato en la posicion ["+i+"] es " + numeros[i] + "\n"; 
              
          }
          JOptionPane.showMessageDialog(null,Datos);
      }
         
         
   public void buscar (){
         int buscar, cont=0 ;
         String impresion= "";
         buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar:"));
         for (int i = 0; i < 10; i++) {
             if(buscar == numeros[i]){
                impresion += "Se encontro valor en la posicion ["+i+"]: " +numeros[i]+"\n";
                 cont++;
             } 
         }
            JOptionPane.showMessageDialog(null,impresion + " \n Se encontraron "+cont+"datos." );
    } 

   
       
  public void modificar (){
        int buscar, conf=0, cont=0;
         buscar=Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar: "));
            for (int i = 0; i < 10; i++) {
                if(buscar == numeros[i]){
                    JOptionPane.showMessageDialog(null, "Se encontro valor en la posicion ["+i+"]:" + numeros[i]);
                    conf = JOptionPane.showConfirmDialog(null, "Desea actualizar este dato?","Informacion", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (conf == JOptionPane.YES_OPTION){
                    numeros[i]= Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el nuevo datos: "));
                    cont++;
                         }
                    }
                    
                }
            JOptionPane.showMessageDialog(null, "se actualizaron " +cont + " datos.");
         
     }
     
     
     
      public void eliminar(){
        int buscar, cont=0 ;
         buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a eliminar:"));
         for (int i = 0; i < 10; i++) {
             if(buscar == numeros[i]){
                  
                 numeros[i]= 0;
                 
                JOptionPane.showMessageDialog(null, "Se encontro el dato a eliminar en la posicion ["+i+"] " );
             } 
         }
    }
     
      
     /*
     public void ordenar(){
         for(int i=0;i<(numeros.length-1);i++){
			for(int j=i+1;j<numeros.length;j++){
				if(numeros[i]>numeros[j]){
					//Intercambiamos valores
					int variableauxiliar=numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=variableauxiliar;
				}
			}
		}
     }
     */
     
   
  
     
     public void borrararray(){
         
      int conf = JOptionPane.showConfirmDialog(null, "Desea borrar todo el vector?","informacion", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
      if(conf == JOptionPane.YES_NO_OPTION){
          for (int i = 0; i < 10; i++) {
              numeros[i]=0;
          }
         }
     }
     
     
      public void salir(){
         System.exit(0); 
     }
      
  public static void main(String[] args) {
        Original vec = new Original();
        numeros = new int[10];
        int op = 0;
        do {
            op = vec.Menu(op);
           
            switch(op){
                case 1: vec.cargar();break;
                case 2: vec.mostrar();break;
                case 3: vec.buscar();break;
                case 4: vec.modificar();break;
                case 5: vec.eliminar();break;
                
                case 6: Arrays.sort(numeros); vec.mostrar();break;
                case 7: vec.borrararray();break;
                case 8: vec.salir(); break;
              //  default:   System.exit(0); 
            }
        } while(op != 0);
        
    }
    
}
