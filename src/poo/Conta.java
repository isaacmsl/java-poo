package poo;

public class Conta {
    public String num;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean aberta;

    public Conta() {}
    
    public Conta(String num, String dono) {
        this.setNum(num);
        this.setDono(dono);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------\nConta: ");
        sb.append(this.getNum());
        sb.append(" ");
        sb.append(this.getTipo());
        sb.append("\n");
        sb.append("Dono: ");
        sb.append(this.getDono());
        sb.append("\n");
        sb.append("Saldo: R$ ");
        sb.append(String.format("%.2f", this.getSaldo()));
        sb.append("\n");
        sb.append("Status: ");
        sb.append((this.isAberta())? "Aberta":"Fechada");
        sb.append("\n----------------\n");
        return sb.toString();
    }
    
    public void abrirConta(String tipoConta) {
        if (!this.isAberta()) {
            boolean podeAbrir = tipoConta.equals("CC") || tipoConta.equals("CP");

            if (podeAbrir) {
                this.setAberta(true);
                this.setTipo(tipoConta);
                
                float saldoInicial = (tipoConta.equals("CC"))? 50:150;
                this.setSaldo(saldoInicial);
                
                System.out.println(this.getTipo() + " aberta com saldo inicial de R$ " + String.format("%.2f", this.getSaldo()));
            } else {
                System.out.println("Não foi possível abrir a conta.");
            }
        } else {
            System.out.println("Conta já está aberta.");
        }
        
    }   
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Não foi possível pois conta possui saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Não foi possível fechar a conta pois está em débito.");
        } else if (this.isAberta()) {
            this.setAberta(false);
            System.out.println("Conta fechada.");
        } else {
            System.out.println("A conta ainda não foi aberta.");
        }
    }
    
    public void depositar(float quantia) {
        if (this.isAberta()) {
            this.setSaldo(this.getSaldo() +  quantia);
            System.out.println("R$ " + quantia + " depositado.");
        } else {
            System.out.println("Conta não está ativa.");
        }
    }
    
    public void sacar(float quantia) {
        if (this.isAberta()) {
            if (this.getSaldo() - quantia > 0) {
                this.setSaldo(this.getSaldo() - quantia);
                System.out.println("R$ " + String.format("%.2f", quantia) + " sacado.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não está ativa.");
        }
    }
    
    public void pagarMensal() {
        if (this.isAberta()) {
            float mensalidade = (this.getTipo().equals("CC"))? 12:20;
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("R$ " + String.format("%.2f", mensalidade) + " pago de mensalidade.");
        } else {
            System.out.println("A conta não está aberta para pagar mensalidade.");
        }
    }

    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return this.saldo;
    }
    
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public boolean isAberta() {
        return this.aberta;
    }
    
    private void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public void setNum(String num) {
        this.num = num;
    }

    public String getNum() {
        return this.num;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return this.dono;
    }
    
}
