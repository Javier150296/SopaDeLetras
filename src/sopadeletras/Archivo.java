/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletras;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/**
 *
 * @author JAVIER1
 */
public class Archivo {
    private JFileChooser chooser;
    private File file;
    private FileReader fReader;
    private BufferedReader bReader;
    private Sopa sopa;
    
    
    public Archivo(){
        file=null;
        fReader=null;
        bReader=null;
    }
    
    public void abrir(String archivo) throws FileNotFoundException, IOException{
        try{
            file = new File(archivo);
            fReader = new FileReader(file);
            bReader = new BufferedReader(fReader);
            
           String linea;
           String temp="";
           String s1,s2;
           Integer x=0,y=0,words=0;
           
            while((linea= bReader.readLine())!= null){
                temp+=linea+'\n';
            } 
            s1=temp;
            int numTokens=0;
            StringTokenizer st= new StringTokenizer(s1);
            while(st.hasMoreTokens()){
                s2=st.nextToken();
                ++numTokens;
                System.out.println("Palabra "+numTokens+" es "+s2);
                switch(numTokens){
                    case 1: x=Integer.valueOf(s2); break;
                    case 2: y=Integer.valueOf(s2); break;
                    case 3: words=Integer.valueOf(s2);
                             sopa = new Sopa(x,y,words);
                    break;
                    default:
                        if(numTokens<=(sopa.getWords()+3)){
                            //agregar al array de palabras
                        }else
                            sopa.addWordMatriz(s2, numTokens);
                }
                
                   
            }
            
        }catch (Exception e){
            
        }finally{
            try{
                if(fReader != null)
                    fReader.close();
            }catch(IOException e2){
                
            }
        }
    }
    
}
