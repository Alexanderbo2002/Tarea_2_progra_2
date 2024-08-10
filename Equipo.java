package futbol;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombreEquipo, Entrenador entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        System.out.println("Entrenador: " + entrenador.getNombre());
        System.out.println("Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + " - " + jugador.getPosicion());
        }
    }
}
