package juegolab4jahaziel;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuegoLab4Jahaziel {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String option = "";
        ArrayList<Jugador> jugador = new ArrayList();
        while (!option.equalsIgnoreCase("E")) {
            option = JOptionPane.showInputDialog("Juego de mesa\n"
                    + "A-Jugadores\n"
                    + "B-Juego\n");

            switch (option) {
                case "a":
                case "A":
                    String leer = JOptionPane.showInputDialog("Jugador\n"
                            + "A-Agregar\n"
                            + "B-Listar\n"
                            + "C-Eliminar\n");

                    switch (leer) {

                        case "a":
                        case "A":

                            String Nombre,
                             Nombre_usuario,
                             Nacimiento,
                             sexo;
                            int edad,
                             score = 0;
                            Nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
                            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
                            Nombre_usuario = (JOptionPane.showInputDialog("Ingrese nombre de usuario:"));
                            Nacimiento = (JOptionPane.showInputDialog("Ingrese lugar de nacimiento:"));
                            sexo = (JOptionPane.showInputDialog("Ingrese sexo:"));

                            jugador.add(new Jugador(Nombre, Nombre_usuario, Nacimiento, sexo, edad, score));
                            break;
                        case "b":
                        case "B":
                            String p = "";
                            for (Object temp :jugador ) {
                            p += jugador.toString() + "\n";
                            }
                            JOptionPane.showMessageDialog(null, p);
                            break;
                        
                        case "c":
                        case "C":
                            int posicion = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingrese posicion para eliminar una nave:")
                            );

                            jugador.remove(posicion);
                            
                            break;

                    }
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
