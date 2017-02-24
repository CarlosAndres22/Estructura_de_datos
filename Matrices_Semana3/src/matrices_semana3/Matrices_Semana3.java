
package matrices_semana3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Matrices_Semana3 {
public static int[][] matriz;
    public int Menu(int opcion) {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t MENU PRINCIPAL MATRICES \n\n "+
                  "1. Cargar datos \n" +
                  "2. Mostrar datos \n" +
                  "3. Buscar datos \n" +
                  "4. Eliminar datos \n" +
                  "5. Actualizar datos \n" +
                  "6. Borrar matriz \n" +
                  "7. Ordenar matriz \n" +
                  "8. Salir \n"
          ));
          return opcion;
        }
    
    // FUNCIONES
    
    
     public void cargar (){
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un dato"));
              }
              
              
          }
    }
      
      
         public void mostrar(){
          String Datos="";
          String datos2="";
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
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
         
         
         
    public void buscar (){
         int buscar, cont=0 ;
         String impresion= "";
         buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar:"));
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if(buscar == matriz[i][j]){
                impresion += "Se encontro valor en la posicion ["+i+"]["+j+"]: " +matriz[i][j]+"\n";
                
                 cont++;
              }  
             }
            
          
         }
            JOptionPane.showMessageDialog(null,impresion + " \n Se encontraron "+cont+"datos." );
    }
     
     
        public void actualizar (){
        int buscar, conf=0, cont=0;
         buscar=Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a buscar: "));
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                     if(buscar == matriz[i][j]){
                    JOptionPane.showMessageDialog(null, "Se encontro valor en la posicion ["+i+"]["+j+"]:" + matriz[i][j]);
                    conf = JOptionPane.showConfirmDialog(null, "Desea actualizar este dato?","Informacion", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (conf == JOptionPane.YES_OPTION){
                    matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el nuevo datos: "));
                    cont++;
                         }
                    }
                }
                    
                }
            JOptionPane.showMessageDialog(null, "se actualizaron " +cont + " datos.");
         
     }


       
     public void eliminar(){
       
      
         int buscar, cont=0 ;
         buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el dato a eliminar:"));
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                  if(buscar == matriz[i][j]){
                 JOptionPane.showMessageDialog(null, "Se encontro el dato en la posicion ["+i+"]["+j+"] el cual es ["+matriz[i][j]+"]  " );
                 cont++;
             }
             if(matriz[i][j] == buscar){
                 matriz[i][j] = 0;
             }
             }
             
         }
         if(cont == 0) {JOptionPane.showMessageDialog(null, "No se encontraron datos " );}
             else JOptionPane.showMessageDialog(null, "Se encontraron ["+cont+"] datos. " );
        
     }
  
     
 public void ordenar(){
      for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if(matriz[i][j] < matriz [k][l]){
                            int temp =matriz[i][j];
                           matriz [i][j] = matriz[k][l];
                           matriz[k][l] = temp;
                        }
                        }
                      }
                    }
 
                  }
            }
        
  
     
     public void borrarArray(){
         int buscar ;
         String Datos= "";
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                matriz[i][j]=0;  
                  if(matriz[i][j]==0){
                  Datos +=   "El dato en la posicion ["+i+"]["+j+"] es " + matriz[i][j] + "\t | \t"; 
              }  else{
                   Datos +=  "El dato en la posicion ["+i+"]["+j+"] es " + matriz[i][j] + "\t | \t"; 
                }
             }
             
         }
         
     }
     
     public void salir(){
         System.exit(0); 
     }
    public static void main(String[] args) {
      Matrices_Semana3 vec = new Matrices_Semana3();
        matriz = new int[3][3];
        int op = 0;
        do {
            op = vec.Menu(op);
            switch(op){
                case 1: vec.cargar();break;
                case 2: vec.mostrar();break;
                case 3: vec.buscar();break;
                case 4: vec.eliminar(); break;
                case 5: vec.actualizar();break;
                case 6: vec.borrarArray();break;
                case 7: vec.ordenar();break;
                case 8: vec.salir(); break;
                
            }
        } while(op != 0);
        
    }
    
}
