package polimorfismo_0506;

public class Polimorfismo_0506 {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Cachorro();
        Animal a3 = new Gato();
        Animal a4 = new Pato();

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
    }
    
}