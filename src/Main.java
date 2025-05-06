public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais", 3, 12.5, "Macho", "Croquetas");
        Gato gato = new Gato("Michi", 2, 4.0, "Hembra", "Pescado");
        Pato pato = new Pato("Donald", 1, 2.0, "Macho", "Granos");

        perro.hacerSonido();
        perro.jugar();
        perro.mostrarCarino();
        perro.ladrar();

        gato.hacerSonido();
        gato.jugar();
        gato.mostrarCarino();
        gato.ronronear();

        pato.hacerSonido();
        pato.jugar();
        pato.mostrarCarino();
        pato.nadar();

        Jirafa jirafa = new Jirafa("Jirafita", 5, 800, "Hembra", "Hierba");
        jirafa.hacerSonido();
        jirafa.cazar();
        jirafa.comerHojas();

        Cocodrilo cocodrilo = new Cocodrilo("Crocodile", 7, 1000, "Macho", "Carnívoro");
        cocodrilo.hacerSonido();
        cocodrilo.nadar();

        Leon leon = new Leon("Simba", 4, 200, "Macho", "Carnívoro");
        leon.hacerSonido();
        leon.rugir();

        Hipopotamo hipopotamo = new Hipopotamo("Hippo", 8, 1500, "Macho", "Herbívoro");
        hipopotamo.hacerSonido();
        hipopotamo.sumergirse();
    }
}
