public class Cocodrilo extends AnimalSalvaje {

    public Cocodrilo(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    public void nadar() {
        System.out.println(nombre + " está nadando en el río.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un rugido bajo.");
    }
}
