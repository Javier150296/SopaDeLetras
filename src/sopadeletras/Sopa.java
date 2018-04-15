/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopadeletras;

/**
 *
 * @author JAVIER1
 */
public class Sopa {
    private Integer dimX;
    private Integer dimY;
    private Integer numWords;
    private String palabras[];
    private Character matriz[][];
    
    public Sopa(){
        
    }
    public Sopa(Integer x, Integer y, Integer words){
        this.dimX=x;
        this.dimY=y;
        this.numWords=words;
        this.palabras = new String[words];
        this.matriz= new Character[y][x];
    }

    public Integer getDimX() {
        return dimX;
    }

    public void setDimX(Integer dimX) {
        this.dimX = dimX;
    }

    public Integer getDimY() {
        return dimY;
    }

    public void setDimY(Integer dimY) {
        this.dimY = dimY;
    }

    public Integer getWords() {
        return numWords;
    }

    public void setWords(Integer words) {
        this.numWords = words;
    }

    public void addWordMatriz(String palabra, Integer posY){
        int y=posY-(4+this.numWords);
        
        for(int x=0; x<palabra.length(); x++){
            this.matriz[y][x]=palabra.charAt(x);
        }
    }
    
    public Character[][] getMatriz(){
        return this.matriz;
    }
    
}
