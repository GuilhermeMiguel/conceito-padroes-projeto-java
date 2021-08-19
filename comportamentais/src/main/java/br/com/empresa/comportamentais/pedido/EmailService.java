package br.com.empresa.comportamentais.pedido;

public class EmailService implements AcaoAposGerarPedido {

	@Override
	public void executa(Pedido pedido) {
		System.out.println("Salvando pedido do(a) senhor(a): " + pedido.getCliente());
	}

	
}
