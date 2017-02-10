package juegolab4jahaziel;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    
    static String [][] tablero = new String [8][8];
    static Scanner sc = new Scanner (System.in);
            
    public String [][] Tablero (){
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                if (i==1&&(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7)){
                    tablero[i][j] = "Peon B";
                } else if (i==6&&(j==0||j==1||j==2||j==3||j==4||j==5||j==6||j==7)){
                    tablero[i][j] = "Peon N";
                    
                } else if (i==0&&(j==1)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==0)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==2)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==3)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==4)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==5)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==6)){
                    tablero[i][j]= futuro();
                    
                } else if (i==0&&(j==7)){
                    tablero[i][j]= futuro();
                }
                else if (i==7&&(j==1)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==0)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==2)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==3)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==4)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==5)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==6)){
                    tablero[i][j]= futuro2();
                    
                } else if (i==7&&(j==7)){
                    tablero[i][j]= futuro2();
                }
                
                
                 
            }
        }
        return tablero;
    }
    
    public String [] Lee_Movimiento(){
        String [] Arreglo = new String [4];
        
        System.out.println("Ingrese la posicion en x de pieza que desea mover");
        int i = sc.nextInt();
        System.out.println("Ingrese la posicion en y de pieza que desea mover");
        int j = sc.nextInt();
        System.out.println("Ingrese la posicion en x a donde movera");
        int k = sc.nextInt();
        System.out.println("Ingrese la posicion en y a donde movera");
        int l = sc.nextInt();
        
        Arreglo [0] = String.valueOf(i);
        Arreglo [1] = String.valueOf(j);
        Arreglo [2] = String.valueOf(k);
        Arreglo [3] = String.valueOf(l);
        
        switch (tablero[i][j]){
            case "Dama B"+"Dama N":
                
                if (tablero [k][l].equals("Dama B")||tablero [k][l].equals("Dama N")||tablero [k][l].equals("Caballo B")||tablero [k][l].equals("Caballo N")||
                        tablero [k][l].equals("Rey B")||tablero [k][l].equals("Rey N")||tablero [k][l].equals("Alfil B")||tablero [k][l].equals("Alfil N")||
                        tablero [k][l].equals("Torre N")||tablero [k][l].equals("Torre B")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l].equals("null")){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
       
            case "Caballo B"+"Caballo N":
                
                if (tablero [k][l].equals("Dama B")||tablero [k][l].equals("Dama N")||tablero [k][l].equals("Caballo B")||tablero [k][l].equals("Caballo N")||
                        tablero [k][l].equals("Rey B")||tablero [k][l].equals("Rey N")||tablero [k][l].equals("Alfil B")||tablero [k][l].equals("Alfil N")||
                        tablero [k][l].equals("Torre N")||tablero [k][l].equals("Torre B")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l].equals("null")&&(k - i) == 2 && (l - j) ==1||((k-i)==1&&(l-j==2))){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
                
            case "Rey B"+"Rey N":
                    
                if (tablero [k][l].equals("Dama B")||tablero [k][l].equals("Dama N")||tablero [k][l].equals("Caballo B")||tablero [k][l].equals("Caballo N")||
                        tablero [k][l].equals("Rey B")||tablero [k][l].equals("Rey N")||tablero [k][l].equals("Alfil B")||tablero [k][l].equals("Alfil N")||
                        tablero [k][l].equals("Torre N")||tablero [k][l].equals("Torre B")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l].equals("null")&&(k - i) == 1 && (l - j) == 1||(k-i==1)){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
                
            
            case "Alfil B"+"Alfil N":
                 
                if (tablero [k][l].equals("Dama B")||tablero [k][l].equals("Dama N")||tablero [k][l].equals("Caballo B")||tablero [k][l].equals("Caballo N")||
                        tablero [k][l].equals("Rey B")||tablero [k][l].equals("Rey N")||tablero [k][l].equals("Alfil B")||tablero [k][l].equals("Alfil N")||
                        tablero [k][l].equals("Torre N")||tablero [k][l].equals("Torre B")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l]== "null"&&(k - i) == 2 && (l - j) == 2||(k - i) == 1 && (l - j) == 1||(k - i) == 3 && (l - j) == 3
                        ||(k - i) == 4 && (l - j) == 4||(k - i) == 5 && (l - j) == 5||(k - i) == 6 && (l - j) == 6||(k - i) == 7 && (l - j) == 7){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
            
            case "Torre B"+"Torre N":
                 if (tablero [k][l].equals("Dama B")||tablero [k][l].equals("Dama N")||tablero [k][l].equals("Caballo B")||tablero [k][l].equals("Caballo N")||
                        tablero [k][l].equals("Rey B")||tablero [k][l].equals("Rey N")||tablero [k][l].equals("Alfil B")||tablero [k][l].equals("Alfil N")||
                        tablero [k][l].equals("Torre N")||tablero [k][l].equals("Torre B")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l]== "null" && (k - i) == 2||(k - i) == 1||(k - i) == 3 ||(k - i) == 4||(k - i) == 5||(k - i) == 6||(k - i) == 7||(l - j) == 2||(l - j) == 1||(l - j) == 3 ||(l-j) == 4||(l - j) == 5||(l - j) == 6||(l - j) == 7){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
            case "Peon B"+"Peon N":
                if (tablero [k][l].equals("Dama B")||tablero [k][l].equals("Dama N")||tablero [k][l].equals("Caballo B")||tablero [k][l].equals("Caballo N")||
                        tablero [k][l].equals("Rey B")||tablero [k][l].equals("Rey N")||tablero [k][l].equals("Alfil B")||tablero [k][l].equals("Alfil N")||
                        tablero [k][l].equals("Torre N")||tablero [k][l].equals("Torre B")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l].equals("null")&&(k - i) == 1||(k-i)==2){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
                
            
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
    
    
    public static String[] futuro = {
        "Dama B",
        "Rey B",
        "Caballo B",
        "Alfil B",
        "Torre B",
    };
    
    public static String futuro() {
        Random random=new Random();
        String prediccion;
        prediccion = futuro[random.nextInt(futuro.length)];
        return prediccion;
    }
    
    public static String[] futuro2 = {
        "Dama N",
        "Rey N",
        "Caballo N",
        "Alfil N",
        "Torre N",
    };
    
    public static String futuro2() {
        Random random=new Random();
        
        String prediccion;
        prediccion = futuro[random.nextInt(futuro.length)];
        return prediccion;
    }
    
    
    
}
