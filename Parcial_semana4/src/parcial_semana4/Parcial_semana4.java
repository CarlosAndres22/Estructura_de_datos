
package parcial_semana4;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Parcial_semana4 {

    public static int[] numeros; 
   
      public int Menu(int opcion) {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"\t\t MENU PRINCIPAL VECTORES \n\n "+
                  "1. Cargar datos \n" +
                  "2. Mostrar datos \n" +
                  "3. Ordenar ascendentemente datos \n" +
                  "4. Ordenar descendentemente datos \n" +
                  "5. Salir \n"
                  
          ));
         
          return opcion;
        }
     
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
         
         
   public void ordenar_ascendentemente (){
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

   
       
  public void ordenar_descendentemente (){
      int aux=0; 
for (int i = 0; i < numeros.length-1; i++) { 
for (int j = i+1; j < numeros.length; j++) { 
if (numeros[j]>numeros[i]) { 
aux=numeros[j]; 
numeros[j]=numeros[i]; 
numeros[i]=aux; 
                } 
             }
         }
    }
     

      public void salir(){
         System.exit(0); 
     }
      
  public static void main(String[] args) {
        Parcial_semana4 vec = new Parcial_semana4();
        numeros = new int[10];
        int op = 0;
        do {
            op = vec.Menu(op);
           
            switch(op){
                case 1: vec.cargar();break;
                case 2: vec.mostrar();break;
                case 3: vec.ordenar_ascendentemente();vec.mostrar();break;
                case 4: vec.ordenar_descendentemente();vec.mostrar();break;
                case 5: vec.salir(); break;
             
            }
        } while(op != 0);
        
    }
    
}
