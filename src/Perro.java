public class Perro extends AnimalDomestico implements Mascota {

    public Perro(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " está ladrando.");
    }

    public void ladrar() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega con la pelota.");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre + " mueve la cola feliz.");
    }
}

