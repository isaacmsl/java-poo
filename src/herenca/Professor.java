package herenca;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public Professor() {}

    public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    public void receberAum(float aumento) {
        this.salario += aumento;
    }
}
