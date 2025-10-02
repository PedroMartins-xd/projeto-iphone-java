package models;

import exceptions.AparelhoDesligado;
import exceptions.AparelhoLigado;
import interfaces.IAparelhoTelefonico;

public class AparelhoTelefonico extends Iphone implements IAparelhoTelefonico {

    public AparelhoTelefonico(String modelo, String cor) {
        super(modelo, cor);
        super.isLigado();
    }

    @Override
    public void ligarAparelho() {
        if (!this.isLigado()) {
            this.ligado = true;
            System.out.println("O aperelho foi ligado!");
        } else {
            throw new AparelhoLigado(
                    "Não é foi possivel, o aparelho ja esta ligado"
            );
        }
    }

    @Override
    public void desligarAparelho() {
        if (this.isLigado()) {
            this.ligado = false;
            System.out.println("O aperelho foi desligado!");
        } else {
            throw new AparelhoDesligado(
                    "Não é foi possivel, o aparelho ja esta desligado"
            );
        }
    }

    @Override
    public void fazerLigacao() {

    }
}
