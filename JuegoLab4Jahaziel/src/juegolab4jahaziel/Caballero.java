package juegolab4jahaziel;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Caballero extends Piezas {

    private String nombre = "Caballero", ToString2 = "CN";
    private int i, j, k, l;

    public Caballero() {
        super();
    }

    public Caballero(Color colo, String Material) {
        super(colo, Material);
    }

    public Color getColo() {
        return colo;
    }

    public void setColo(Color colo) {
        this.colo = colo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getToString2() {
        return ToString2;
    }

    public void setToString2(String ToString2) {
        this.ToString2 = ToString2;
    }

    @Override
    public String toString() {
        if (super.colo.equals(Color.BLACK)) {
            return "CN";
        } else if (super.colo.equals(Color.WHITE)) {
            return "CB";
        } else {
            return "Color no valido";
        }
    }

    String[][] tablero = new String[10][10];

    public String[] Movimiento(int i, int j, int k, int l, String[][] tablero, String[] Arreglo) {

        if ((l - j) == 1 || (k - i) == 1) {
            if (tablero[k][l].equals("CB") || tablero[k][l].equals("CN") || tablero[k][l].equals("DN") || tablero[k][l].equals("DB")
                    || tablero[k][l].equals("MB") || tablero[k][l].equals("MN") || tablero[k][l].equals("FN") || tablero[k][l].equals("FB")
                    || tablero[k][l].equals("RB") || tablero[k][l].equals("RN")) {

                tablero[i][j] = tablero[i][j];
                return Arreglo;

            } else if (tablero[k][l].equals("null") && (l - j) == 1 || (k - i) == 1) {
                tablero[k][l] = tablero[i][j];
                tablero[i][j] = "null";
                return Arreglo;
            } else {
                
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
