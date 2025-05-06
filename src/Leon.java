public class Leon extends AnimalSalvaje {

    public Leon(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    public void rugir() {
        System.out.println(nombre + " está rugiendo.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un rugido fuerte.");
    }
}
