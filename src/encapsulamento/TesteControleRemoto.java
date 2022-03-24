package encapsulamento;

public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.desligar();
        c.play();
        c.maisVolume();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.menosVolume();
        c.ligarMudo();
        c.ligarMudo();
        c.desligarMudo();
        c.play();
        c.play();
        c.pause();
        c.pause();

        c.abrirMenu();
    }
}
