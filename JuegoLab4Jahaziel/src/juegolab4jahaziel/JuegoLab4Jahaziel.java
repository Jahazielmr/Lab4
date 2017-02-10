package juegolab4jahaziel;

import javax.swing.JOptionPane;

public class JuegoLab4Jahaziel {

    
    public static void main(String[] args) {
         String option = "";
        
        while (!option.equalsIgnoreCase("E")){
            option = JOptionPane.showInputDialog("Juego de mesa\n"
                    + "A-Jugadores\n"
                    + "B-Juego\n");
            
            switch (option){
                case "a":
                case "A":
                    
                    
                    break;
                case "b":
                case "B":
                    
                    
                    break;
                
                
            }
        }
        
    }
    
}
