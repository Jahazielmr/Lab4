package juegolab4jahaziel;

import com.sun.prism.paint.Color;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Juego {
    
     String [][] tablero = new String [10][10];
     Scanner sc = new Scanner (System.in);
     Piezas p = new Caballero();
    public String [][] Tablero (){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j]= "null";
            }
        }
        
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (i==0&&(j==0||j==9)){
                    tablero[i][j] = "CB";
                } else if (i==0&&(j==2||j==7)){
                    tablero[i][j] = "FB";
                } else if (i==0&&(j==4)){
                    tablero[i][j]= "RB";
                    
                } else if (i==1&&(j==0||j==9||j==3||j==6)){
                    tablero[i][j]= "DB";
                    
                } else if (i==1&&(j==4)){
                    tablero[i][j]= "CB";
                  
                }
                 else if (i==1&&(j==5)){
                    tablero[i][j]= "FB";
                    
                } //
                
                if (i==9&&(j==0||j==9)){
                    tablero[i][j] = "CN";
                } else if (i==9&&(j==2||j==7)){
                    tablero[i][j] = "FN";
                } else if (i==9&&(j==5)){
                    tablero[i][j]= "RN";
                    
                } else if (i==8&&(j==0||j==9||j==3||j==6)){
                    tablero[i][j]= "DN";
                    
                } else if (i==8&&(j==5)){
                    tablero[i][j]= "CN";
                  
                }
                 else if (i==8&&(j==4)){
                    tablero[i][j]= "FN";
                 }
                
            }
        }
        return tablero;
    }
    
    public String [] Lee_Movimiento(){
        String [] Arreglo = new String [4];
        Piezas movCaballero = new Caballero();
        Piezas movDuende = new Duende();
        Piezas movDragon = new Dragon();
        Piezas movRey = new Rey();
        
        System.out.println("Ingrese la posicion en y de pieza que desea mover");
        int i = sc.nextInt();
        System.out.println("Ingrese la posicion en x de pieza que desea mover");
        int j = sc.nextInt();
        System.out.println("Ingrese la posicion en y a donde movera");
        int k = sc.nextInt();
        System.out.println("Ingrese la posicion en x a donde movera");
        int l = sc.nextInt();
        
        Arreglo [0] = String.valueOf(i);
        Arreglo [1] = String.valueOf(j);
        Arreglo [2] = String.valueOf(k);
        Arreglo [3] = String.valueOf(l);
        
        switch (tablero[i][j]){
                case "CB":
                case "CN":
                    movCaballero.Movimiento(i, j, k, l, tablero, Arreglo);
                
                case "DB"://duende
                case "DN":
                
                    movDuende.Movimiento(i, j, k, l, tablero, Arreglo);
                
            case "FB"://dragon igual que el CApitan
            case "FN":
                
               movDragon.Movimiento(i, j, k, l, tablero, Arreglo);
                
            
            case "RB":
            case "RN":
               //no se puede mover el rey
               movRey.Movimiento(i, j, k, l, tablero, Arreglo);
                
                
                
               break; 
               
        }
        tablero [k][l] = tablero [i][j];
        tablero [i][j] = "null";
        
        return Arreglo;
        
    }    
    
    String[][] escribir (String[][] x, String[] y){
        tablero=x;
        tablero[Integer.parseInt(y[1])][Integer.parseInt(y[2])]=y[2];
        return tablero;
    }
    
    
    
    
    
}
