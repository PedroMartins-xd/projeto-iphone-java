package models;

import interfaces.IAparelhoTelefonico;

public class AparelhoTelefonico extends Iphone implements IAparelhoTelefonico {

    public AparelhoTelefonico(String modelo, String cor) {
        super(modelo, cor);
        super.isLigado();
    }

    @Override
    public void ligarAparelho() {

    }

    @Override
    public void desligarAparelho() {

    }

    @Override
    public void fazerLigacao() {

    }
}
