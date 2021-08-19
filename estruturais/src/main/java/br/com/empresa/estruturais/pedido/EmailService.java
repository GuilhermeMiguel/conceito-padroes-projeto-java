package br.com.empresa.estruturais.pedido;

public class EmailService implements AcaoAposGerarPedido {

	@Override
	public void executa(Pedido pedido) {
		System.out.println("Salvando pedido do(a) senhor(a): " + pedido.getCliente());
	}

	
}
