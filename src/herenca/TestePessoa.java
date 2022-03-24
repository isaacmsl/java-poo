package herenca;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Isaac", 20, "Masculino");
        Aluno p2 = new Aluno("20211114010047", "INFO", "Kézia", 18, "Feminino");
        Funcionario p3 = new Funcionario("TI", true, "Tiago", 18, "Masculino");
        Professor p4 = new Professor("Matemática", 7000f, "Tonhão", 34, "Masculino");
        
        p1.setNome("Lourenço");
        p2.setNome("Lima");
        p3.setNome("Rodrigues");
        p4.setNome("Igor");
        
        //p1.mudarTrabalho();
        p4.receberAum(1000);
        System.out.println(p4);
    }
}
