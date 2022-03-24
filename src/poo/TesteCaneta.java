package poo;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c = new Caneta();
        c.setModelo("Bic Cristal");
        c.setCor("Azul");
        //c.ponta = 0.5f;
        c.setPonta(0.5f);
        c.setCarga(90);
        c.destampar();
        System.out.println(c);
        
        Caneta c1 = new Caneta("NIC", "Preta", 0.8f, 76, true);
        System.out.println(c1);
    }
}
