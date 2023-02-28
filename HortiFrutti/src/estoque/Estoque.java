package estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Item> estoque = new ArrayList<>();

	private int indiceTeste = 0;

	// Metodos auxliares

	// Adicionar arquivo na lista<utilizando os atribulos Itens>
	public void adicionarLista(String tipo, String marca, double preco, int id, int quantidade) {
		Produto p = new Produto(tipo, marca, valorQtdNegativo(id), valorPrecoNegativo(preco));
		this.estoque.add(new Item(p, valorQtdNegativo(quantidade)));
	}

	// checklist do estoque
	public boolean checarEstoque(String tipoProduto, String nomeProduto) {
		for (int i = 0; i < estoque.size(); i++) {
			if (estoque.get(i).p.getTipo().equalsIgnoreCase(tipoProduto)
					&& estoque.get(i).p.getMarca().equalsIgnoreCase(nomeProduto)) {
				setIndiceTeste(i);
				return true;
			}
		}
		return false;
	}

	public void alterarValorEstoque(double novoPreco, int novaQuantidade) {
		double precoAntigo = estoque.get(getIndiceTeste()).p.getPreco();
		int qtdAntigo = estoque.get(getIndiceTeste()).getQuantidade();
		estoque.get(getIndiceTeste()).p.setPreco(novoPreco);
		estoque.get(getIndiceTeste()).setQuantidade(novaQuantidade + qtdAntigo);

		System.out.printf(
				"DADOS DO PRODUTO ALTERADO\n\n" + "Tipo do produto: %s" + "\nMarca do produto: R$%s"
						+ "\nPreco: R$%.2f >> Novo preco: R$%.2f" + "\nQuant.: %d unid. >> Nova Quant.: %d unid.\n",
				estoque.get(getIndiceTeste()).p.getTipo(), estoque.get(getIndiceTeste()).p.getMarca(), precoAntigo,
				estoque.get(getIndiceTeste()).p.getPreco(), qtdAntigo, estoque.get(getIndiceTeste()).getQuantidade());
	}

	// Remover produto da lista através do indice
	public void removerLista(String nomeProduto) {
		for (int j = 0; j < estoque.size(); j++) {
			if (estoque.get(j).p.getMarca().equalsIgnoreCase(nomeProduto)) {
				estoque.remove(j);
			}
		}
	}

	// Alterar valor da quantidade/preço dentro da lista
	public void alterarPreco(String nome, int opcao, double novoPreco, int novaQuantidade) {
		for (int k = 0; k < estoque.size(); k++) {
			// mapear a lista e buscar e puxar o indice desejado
			if (estoque.get(k).p.getMarca().equalsIgnoreCase(nome)) {
				// caso queira alterar preco digita 1
				if (opcao == 1) {
					estoque.get(k).p.setPreco(novoPreco);
					;
					// caso queira alterar a quantidade digita 2
				} else if (opcao == 2) {
					estoque.get(k).setQuantidade(novaQuantidade);
				}
			}
		}
	}

	// Visualizar lista apartir de um laço de repetição
	public void visualizarLista() {
		// Verificar Lista
		estoque.forEach(nome -> {
			System.out.printf("ID: %04d\nTipo do Produto: %s\nMarca: %s\nPreco: R$%.2f\nQuant: %d unid.\n\n", nome.p.getId(),nome.p.getTipo(),
					nome.p.getMarca().substring(0, 1).toUpperCase().concat(nome.p.getMarca().substring(1)),
					nome.p.getPreco(), nome.getQuantidade());
		});
		// condição caso a lista estiver vazia imprimir está informação.
		if (estoque.size() == 0) {
			System.out.println("Nenhum produto no estoque");
		}
	}

	// Tratamentos

	private int valorQtdNegativo(int qtd) {
		if (qtd <= 0) {
			return qtd = 0;
		}
		return qtd;
	}

	private double valorPrecoNegativo(double preco) {
		if (preco <= 0) {
			return preco = 0;
		}
		return preco;
	}

	public int getIndiceTeste() {
		return indiceTeste;
	}

	public void setIndiceTeste(int indiceTeste) {
		this.indiceTeste = indiceTeste;
	}
}