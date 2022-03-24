package polimorfismo;

public class Lobo extends Mamifero {

    public Lobo(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }
    
    @Override()
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuu!");
    }
}
