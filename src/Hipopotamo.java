public class Hipopotamo extends AnimalSalvaje {

    public Hipopotamo(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    public void sumergirse() {
        System.out.println(nombre + " se está sumergiendo en el agua.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido profundo.");
    }
}
