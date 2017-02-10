package juegolab4jahaziel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuegoLab4Jahaziel {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option = "";
        while (!option.equalsIgnoreCase("E")) {
            option = JOptionPane.showInputDialog("Juego de mesa\n"
                    + "A-Jugadores\n"
                    + "B-Juego\n");

            switch (option) {
                case "a":
                case "A":

                    break;
                case "b":
                case "B":
                    Juego T = new Juego();
                    char resp;
                    String[][] tab = new String[10][10];
                    tab = T.Tablero();
                    do {
                        System.out.println("");
                        System.out.println("");
                        Imprimir_TableroRecursivo(tab, 0, 0);
                        System.out.println("");
                        String[] Array = new String[4];
                        Array = T.Lee_Movimiento();
                        Imprimir_TableroRecursivo(T.escribir(tab, Array), 0, 0);
                        System.out.println("Desea continuar s/n");
                        resp = sc.next().charAt(0);
                    } while (resp == 's' || resp == 'S');

                    break;

            }
        }

    }

    static void Imprimir_TableroRecursivo(String[][] matrix, int filas, int columnas) {
        if (filas == matrix.length - 1 && columnas == matrix[0].length - 1) {
            System.out.println(matrix[filas][columnas]);

        } else if (columnas == matrix[0].length - 1) {
            System.out.println(matrix[filas][columnas]);
            Imprimir_TableroRecursivo(matrix, filas + 1, 0);
        } else {
            System.out.print(matrix[filas][columnas] + "\t" + "\t" + "\t" + "\t");
            Imprimir_TableroRecursivo(matrix, filas, columnas + 1);
        }

    }
}