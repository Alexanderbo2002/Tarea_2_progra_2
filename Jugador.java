package futbol;

public class Jugador extends Persona implements AccionesJugador {
    private String posicion;
    private int numeroCamiseta;

    public Jugador(String nombre, int edad, String posicion, int numeroCamiseta) {
        super(nombre, edad);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " está jugando un partido.");
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
}
