package encapsulamento;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        if (!this.isLigado()) {
            this.setLigado(true);
            System.out.println("Ligado");
        } else {
            System.out.println("Já está ligado");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado()) {
            this.setLigado(false);
            System.out.println("Desligado");
        } else {
            System.out.println("Já está desligado");
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------------------");
        System.out.println((this.isLigado())? "Ligado":"Desligado");
        System.out.print("Volume: " + this.getVolume() + " ");
        
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
        }
        
        System.out.println("");
        System.out.println((this.isTocando())? "Tocando":"Não está tocando");
        System.out.println("-------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Aumentou volume para: " + this.getVolume());
        } else {
            System.out.println("Impossível aumentar pois está desligado");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Diminui volume para: " + this.getVolume());
        } else {
            System.out.println("Impossível diminuir pois está desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mudo ativado");
        } else if (this.isLigado()) {
            System.out.println("Já está mudo");
        } else {
            System.out.println("Impossível ativar mudo pois está desligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
            System.out.println("Mudo desativado");
        } else if (this.isLigado()) {
            System.out.println("Mudo já está desativado");
        } else {
            System.out.println("Impossível desligador mudo pois está desligado");   
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
            System.out.println("Tocando");
        } else if (this.isLigado()) {
            System.out.println("Já está tocando");
        } else {
            System.out.println("Impossível tocar pois está desligado");   
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
            System.out.println("Pausado");
        } else if (this.isLigado()) {
            System.out.println("Já está pausado");
        } else {
            System.out.println("Impossível pausar pois está desligado");   
        }
    }

}
