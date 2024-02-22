package Sistema;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {

	public List<Produto> InfoProdutos = new ArrayList<>();

	public void listaCompras() {
		for (Produto produtos : InfoProdutos) {
			var cod = produtos.codigo;
			var nome = produtos.nome;
			var quantidade = produtos.quantidade;
			var valor = produtos.valor;
			System.out.println("| COD: " + cod + " | PRODUTO: " + nome + " | QNT: " + quantidade + " | Valor Unit: "
					+ valor + " |");
			System.out.println("---------------------------------------------------------------------------");

		}
	}

	public double total() {
		double soma = 0.0;
		for (Produto produtos : InfoProdutos) {
			soma += produtos.valor * produtos.quantidade;
		}
		return soma;
	}
}