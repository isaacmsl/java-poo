package polimorfismo;

public class Teste {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Mamifero m = new Mamifero("Preto", 10, 5, 4);
        Lobo l = new Lobo("Cinza", 15, 4, 4);
        Cachorro c = new Cachorro("Marrom", 8, 3, 4);
        
        m.emitirSom();
        l.emitirSom();
        c.emitirSom();
        
        c.reagir("olá");
        c.reagir(true);
        c.reagir(10, 5);
        c.reagir(17, 0);
    }
}
