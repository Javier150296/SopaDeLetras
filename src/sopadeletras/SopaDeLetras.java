/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletras;

import java.io.IOException;

/**
 *
 * @author JAVIER1
 */
public class SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Archivo archivito = new Archivo();
        //archivito.abrir("sopa1.txt");
        int a=121 ,b=165;
        int c=a+b;
        System.out.println(String.format("%c + %c = %c \n %d + %d = %d",a,b,c,a,b,c));
    }
    
}
