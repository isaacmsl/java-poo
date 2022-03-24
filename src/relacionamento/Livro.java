package relacionamento;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro() {}

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (!(this.aberto)) {
            this.aberto = true;
            System.out.println("Livro aberto");
        } else {
            System.out.println("Já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto) {
            this.aberto = false;
            System.out.println("Livro fechado");
        } else {
            System.out.println("Já está fechado");
        }
    }

    @Override
    public void folhear(int pag) {
        if (pag > 0 && pag <= this.totPaginas) {
            this.pagAtual = pag;
            System.out.println("Folheado para página " + this.pagAtual);
        } else {
            System.out.println("Página inválida");
        }
    }

    @Override
    public void avancarPag() {
        if((this.pagAtual + 1) <= this.totPaginas) {
            this.pagAtual++;
            System.out.println("Você foi para página " + this.pagAtual);
        } else {
            System.out.println("Você está no final do livro");
        }
    }

    @Override
    public void voltarPag() {
        if((this.pagAtual - 1) > 0) {
            this.pagAtual--;
            System.out.println("Você foi para página " + this.pagAtual);
        } else {
            System.out.println("Você está no início do livro");
        }
    }

    public void detalhes() {
        System.out.println("Livro{\n" + " titulo=" + titulo + ",\n autor=" + autor + ",\n totPaginas=" + totPaginas + ",\n pagAtual=" + pagAtual + ",\n aberto=" + aberto + ",\n leitor=" + leitor + "\n}");
    }
    
    
    
}