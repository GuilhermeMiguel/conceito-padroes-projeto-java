package br.com.empresa.comportamentais.pedido;

public class SalvaPedidoService implements AcaoAposGerarPedido {

	@Override
	public void executa(Pedido pedido) {
		System.out.println("Enviando e-mail para o(a) senhor(a): " + pedido.getCliente());
	}

}
