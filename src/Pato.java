public class Pato extends AnimalDomestico implements Mascota {

    public Pato(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " está graznando.");
    }

    public void nadar() {
        System.out.println(nombre + " está nadando en el lago.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega chapoteando en el agua.");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre + " grazna cerca de ti.");
    }
}
