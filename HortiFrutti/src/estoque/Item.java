package estoque;

public class Item {
	private int quantidade;
	Produto p;

	public Item(Produto p, int quantidade) {
		// TODO Auto-generated constructor stub
		this.quantidade = quantidade;
		this.p = p;
	}

	public Item(String tipo, String marca, double preco, int id, int quantidade) {
		this.p.setId(id);
		this.p.setTipo(tipo);
		this.p.setMarca(marca);
		this.p.setPreco(preco);
		this.quantidade = quantidade;
	}
	

	void qtdNegativa() {
		if (quantidade <= 0) {
			this.quantidade = 0;
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getP() {
		return p;
	}

	public void setP(Produto p) {
		this.p = p;
	}

}