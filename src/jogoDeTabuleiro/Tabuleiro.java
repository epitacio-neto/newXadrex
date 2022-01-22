package jogoDeTabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas <1) {
			throw new ExcecaoTabuleiro("Erro ao criar o tabuleiro: deve ter pelo menos 1 linha e 1 coluna");
		} 
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linhas, int colunas) {
		if (!posicaoExistente(linhas, colunas)) {
			throw new ExcecaoTabuleiro("Posição fora do tabuleiro");
		}
		return pecas[linhas][colunas];
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoTabuleiro("Posição fora do tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (haPeca(posicao)) {
			throw new ExcecaoTabuleiro("Há outra peça nessa posição " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
		}
	
	private boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(),posicao.getColuna());
	}
	
	public boolean haPeca(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new ExcecaoTabuleiro("Posição fora do tabuleiro");
		}
		return peca(posicao) != null;
	}
	
	
}
