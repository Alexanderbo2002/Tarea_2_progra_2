package futbol;

public class Entrenador extends Persona implements AccionesEntrenador {
    private int anosExperiencia;

    public Entrenador(String nombre, int edad, int anosExperiencia) {
        super(nombre, edad);
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void planificarEntrenamiento() {
        System.out.println(nombre + " está planificando el entrenamiento.");
    }

    @Override
    public void dirigirPartido() {
        System.out.println(nombre + " está dirigiendo el partido.");
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }
}
