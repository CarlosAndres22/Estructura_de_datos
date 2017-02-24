/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumavectores;

/**
 *
 * @author C.andres
 */
import javax.swing.JOptionPane;

public class OperacionesVectores {

    public static void main(String[] args) {
        int vec1[]=new int[10];
        int vec2[]=new int[10];
        int vec3[]=new int[10];
        
        int op=0;
        String menu="***** Menú operaciones de vectores *****\n";
        menu+="1.- Llenar vectores\n";
        menu+="2.- Suma de vectores\n";
        menu+="3.- Resta de vectores\n";
        menu+="4.- Multiplicación de vectores\n";
        menu+="5.- Salir\n";
        menu+="Digita una opción";
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op){
                case 1:
                    for(int i=0;i<vec1.length;i++){
                        vec1[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vec1"+"["+i+"]"));
                    }
                    for(int i=0;i<vec2.length;i++){
                        vec2[i]=Integer.parseInt(JOptionPane.showInputDialog("Digita el valor para vec2"+"["+i+"]"));
                    }
                    //Imprime los vectores
                    String cad1="", cad2="";
                    for(int i=0;i<vec1.length;i++){
                        cad1+=vec1[i]+" ";
                        cad2+=vec2[i]+" ";
                    }
                    System.out.println("vec1: "+cad1);
                    System.out.println("vec2: "+cad2);
                    break;
                case 2:
                    //Suma de vectores
                   
                            
                            String acum="La suma es de: ";
                    for(int i=0;i<vec1.length;i++){
                        vec3[i]=vec1[i]+vec2[i];
                        acum +=  vec3[i]+"  ";
                       
                    }
                     JOptionPane.showMessageDialog(null, acum)  ; 
                    //System.out.println();
                    break;
                case 3:
                    //Resta de vectores
                    String acum2="La resta es de: ";
                    for(int i=0;i<vec1.length;i++){
                        vec3[i]=vec1[i]-vec2[i];
                        acum2 +=  vec3[i]+"  ";
                    }
                   JOptionPane.showMessageDialog(null, acum2)  ; 
                    break;
                case 4:
                    //Multiplicación de vectores
                   String acum3="El resultado de la multiplicacion es : ";
                    for(int i=0;i<vec1.length;i++){
                        vec3[i]=vec1[i]*vec2[i];
                        acum3 +=  vec3[i]+"  ";
                    }
                    JOptionPane.showMessageDialog(null, acum3)  ; 
                    break;
            }
        }while(op!=5);
    }
}