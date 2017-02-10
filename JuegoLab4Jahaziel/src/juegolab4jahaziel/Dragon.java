package juegolab4jahaziel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Dragon extends Piezas{
    

    @Override
    public String[] Movimiento(int i, int j, int k, int l, String[][] tablero, String[] Arreglo) {
        
        if ((l - j) == 1||(k-i)==1){
          if (tablero [k][l].equals("CB")||tablero [k][l].equals("CN")||tablero [k][l].equals("DN")||tablero [k][l].equals("DB")||
                        tablero [k][l].equals("RB")||tablero [k][l].equals("RN")){
                    
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                    
                } else if (tablero [k][l].equals("null")&&(l - j) == 1||(k-i)==1){
                    tablero [k][l] = tablero [i][j];
                    tablero [i][j] = "null";
                    return Arreglo;
                } else{
                    tablero [i][j] = tablero [i][j];
                    return Arreglo;
                }
        } else {
            try {
                throw new MyException("Error");
            } catch (MyException ex) {
                Logger.getLogger(Caballero.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return Arreglo;
        
    }
    
    
    
}
