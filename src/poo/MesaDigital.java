package poo;

public class MesaDigital {
    private String marca;
    private String modelo;
    private String cor;
    private boolean ligado;
    
    public MesaDigital() {}
    
    public MesaDigital(String marca, String modelo, String cor, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mesa digital ");
        sb.append(this.marca);
        sb.append(" ");
        sb.append(this.modelo);
        sb.append(" da cor ");
        sb.append(this.cor);
        sb.append(" está ");
        sb.append((this.ligado)? "ligada":"desligada");
        return sb.toString();
    }
    
}
