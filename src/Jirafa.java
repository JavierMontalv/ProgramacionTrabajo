public class Jirafa extends AnimalSalvaje {

    public Jirafa(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        super(nombre, edad, peso, sexo, tipoAlimentacion);
    }

    public void comerHojas() {
        System.out.println(nombre + " está comiendo hojas altas.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido suave.");
    }
}

