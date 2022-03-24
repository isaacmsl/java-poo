package relacionamento;

public class TesteLivro {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Isaac", 20, "Masculino");
        Livro l = new Livro("Perfume: A história de um assassino", "Patrick Suskind", 318, 1, false, p);
        l.abrir();
        l.folhear(317);
        l.avancarPag();
        l.avancarPag();
        l.voltarPag();
        l.fechar();
        l.detalhes();
    }
 
}
