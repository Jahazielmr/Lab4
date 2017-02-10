package juegolab4jahaziel;

public class Jugador {
    private String nombre, nombre_usuario, Nacimiento, sexo;
    private int edad, score;

    public Jugador() {
    }

    public Jugador(String nombre, String nombre_usuario, String Nacimiento, String sexo, int edad, int score) {
        this.nombre = nombre;
        this.nombre_usuario = nombre_usuario;
        this.Nacimiento = Nacimiento;
        this.sexo = sexo;
        this.edad = edad;
        this.score = score;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", nombre_usuario=" + nombre_usuario + ", Nacimiento=" + Nacimiento + ", sexo=" + sexo + ", edad=" + edad + ", score=" + score + '}';
    }
    
    
    
    
    
    
    
    
}
