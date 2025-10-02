package models;

import exceptions.AparelhoDesligado;
import exceptions.TocandoMusica;
import interfaces.IReprodutorMusical;

public class ReprodutorMusical extends Iphone implements IReprodutorMusical {

    private boolean play;

    public ReprodutorMusical(String modelo, String cor) {
        super(modelo, cor);
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    @Override
    public void tocarMusica() {
        if (this.isLigado() == true) {
            this.play = true;
            System.out.println("Tocando musica...");
        } else {
            throw new AparelhoDesligado(
                    "O aparelho telefonico esta desligado," +
                            " não é possivel tocar uma musica"
            );
        }
    }

    @Override
    public void pausarMusica() {
        if (this.isLigado() == true) {
            if (this.play == true) {
                this.play = false;
                System.out.println("Pausando musica...");
            } else {
                throw new TocandoMusica(
                        "Não foi possivel! a musica ja esta pausada"
                );
            }
        } else {
            throw new AparelhoDesligado(
                    "O aparelho telefonico esta desligado," +
                            " não é possivel tocar uma musica"
            );
        }
    }
}
