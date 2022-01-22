package peca.xadrez;

import jogoDeTabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	@Override
	public String toString() {
		if (super.getCor() == Cor.BRANCO) {
			return "\u2656";
		} else {
			return "\u265C";
		}
	}
}
