package Proyect;

public class Jugador {
	
    private String nombre;
    private int puntajeActual, puntajeMaximo;

    public Jugador(String nombre, int puntajeActual, int puntajeMaximo) {
        this.nombre = nombre;
        this.puntajeActual = puntajeActual;
        this.puntajeMaximo = puntajeMaximo; 
    }

    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje >= 0) {
            puntajeActual = nuevoPuntaje;

            if (nuevoPuntaje > puntajeMaximo) {
                puntajeMaximo = nuevoPuntaje;
            }

            System.out.println("Puntaje actualizado correctamente");
        } else {
            System.out.println("Puntaje inválido");
        }
    }

    // MÉTODO PARA MOSTRAR
    public void mostrar() {
        System.out.println("Jugador: " + nombre);
        System.out.println("Puntaje actual: " + puntajeActual);
        System.out.println("Puntaje máximo: " + puntajeMaximo);
    }
}