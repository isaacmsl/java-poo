package relacionamento;

public class TesteLuta {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[4];
        lutadores[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,3,1);
        lutadores[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        lutadores[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        lutadores[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        
        Lutador pretty = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,3,1);
        
        Luta luta = new Luta();
        luta.lutar();
        luta.marcarLuta(lutadores[0], lutadores[1]);
        luta.lutar();
    }
}

