public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected double peso;
    protected String sexo;
    protected String tipoAlimentacion;

    public Animal(String nombre, int edad, double peso, String sexo, String tipoAlimentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public abstract void hacerSonido();

    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }

    public void desplazarse() {
        System.out.println(nombre + " se está desplazando.");
    }
}
