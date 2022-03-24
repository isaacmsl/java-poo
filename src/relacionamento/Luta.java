package relacionamento;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        boolean diferentes = !(l1.equals(l2));
        boolean mesmaCategoria = (l1.getCategoria()).equals(l2.getCategoria());
        
        if (diferentes && mesmaCategoria) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
            System.out.println("Luta marcada. " + l1.getNome() + " vs " + l2.getNome());
        } else {
            this.setAprovada(false);
            this.desafiante = null;
            this.desafiado = null;
            System.out.println("Luta não foi marcada. Categorias diferentes e/ou o desafiante e desafiado são o mesmo lutador.");
        }
    }
    public void lutar() {
        if (this.aprovada) {
            this.desafiante.apresentar();
            this.desafiado.apresentar();
            int vencedor = (int) (Math.random() * 2);
            
            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                }
                case 1 -> {
                    System.out.println(this.desafiante.getNome() + " é o vencedor!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    this.desafiante.status();
                }
                case 2 -> {
                    System.out.println(this.desafiado.getNome() + " é o vencedor!");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    this.desafiado.status();
                }
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }    

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }   
    
}

