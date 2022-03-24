package poo;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta("123-5", "Isaac");
        c.abrirConta("CC");
        c.sacar(1000);
        c.depositar(1000);
        c.fecharConta();
        c.pagarMensal();
        c.sacar(1000);
        c.pagarMensal();
        c.pagarMensal();
        c.pagarMensal();
        c.pagarMensal();
        System.out.println(c.getSaldo());
        c.abrirConta("CC");
        
        System.out.println(c);  
    }
}
