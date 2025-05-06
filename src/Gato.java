public class Gato extends AnimalDomestico implements Mascota {

    public Gato(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " está maullando.");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando.");
    }

    @Override
    public void jugar() {
        System.out.println(nombre + " juega con un ovillo de lana.");
    }

    @Override
    public void mostrarCarino() {
        System.out.println(nombre + " se frota contra ti.");
    }
}
