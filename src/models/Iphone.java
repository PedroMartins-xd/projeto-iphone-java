package models;

public abstract class Iphone {

    private String modelo;
    private String cor;
    private boolean ligado;

    public Iphone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.ligado = false;
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
}
