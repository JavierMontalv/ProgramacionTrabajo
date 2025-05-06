public abstract class AnimalSalvaje extends Animal {

    public AnimalSalvaje(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    public void cazar() {
        System.out.println(nombre + " está cazando.");
    }

    @Override
    public abstract void hacerSonido();
}
