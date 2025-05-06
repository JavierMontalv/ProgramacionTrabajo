public abstract class AnimalDomestico extends Animal {

    public AnimalDomestico(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    public abstract void jugar();
    public abstract void mostrarCarino();
}
