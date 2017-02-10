package juegolab4jahaziel;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Rey extends Piezas{


    @Override
    public String[] Movimiento(int i, int j, int k, int l, String[][] tablero, String[] arreglo) {
       if (tablero[i][j].equals("RB")||tablero[i][j].equals("RN")){
       
           return null;
       } else {
            try {
                throw new MyException("Error no Moleste al rey no se quiere mover");
            } catch (MyException ex) {
                Logger.getLogger(Caballero.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
       
       return null;
       
    }
    
}
