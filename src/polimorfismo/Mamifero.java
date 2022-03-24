package polimorfismo;

public class Mamifero extends Animal {
    protected String corPelo;

    public Mamifero(String corPelo, float peso, int idade, int membros) {
        this.corPelo = corPelo;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
}
