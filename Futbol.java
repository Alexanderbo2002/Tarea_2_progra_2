package futbol;

public class Futbol {
    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador("Yova", 45, 20);
        Equipo equipo = new Equipo("Los derivados de la umg", entrenador);

        Jugador jugador1 = new Jugador("Gerson", 24, "Delantero", 9);
        Jugador jugador2 = new Jugador("Rode", 27, "Defensa", 5);
        Jugador jugador3 = new Jugador("Lester", 22, "Portero", 1);

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        equipo.mostrarEquipo();
    }
}
