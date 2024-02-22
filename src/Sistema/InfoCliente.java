package Sistema;
public class InfoCliente {
	public ListaDeCompras listCompras;

	public String impressora(Cliente cliente) {
		return "********************************NOTA FISCAL********************************\n" + "\nCliente: "
				+ cliente.nome + "\nCPF: " + cliente.getCPF()
				+ "\n\n****************************ENDERECO DE ENTREGA****************************\n" + "\nCEP: "
				+ cliente.getCEP() + "\nBairro: " + cliente.bairro + "\nRua: " + cliente.rua + "\nCasa: " + cliente.casa
				+ "\nComplemento: " + cliente.complemento
				+ "\n\n******************************LISTA DE COMPRAS*****************************\n\n"
				+ "---------------------------------------------------------------------------";
	}
}