package peca.xadrez;

import jogoDeTabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		if (super.getCor() == Cor.BRANCO) {
			return "\u2654";
		} else {
			return "\u265A";
		}
	}
}
