package estoque;

public class Produto {
	private int id;
	private String marca;
	private String tipo;
	private double preco;

	public Produto(String tipo, String marca, int id, double preco) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setMarca(marca);
		this.setPreco(preco);
		this.setTipo(tipo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}