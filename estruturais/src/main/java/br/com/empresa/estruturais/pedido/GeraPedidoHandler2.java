package br.com.empresa.estruturais.pedido;

import java.util.List;

public class GeraPedidoHandler2 /*implements handler*/{

	
	private List<AcaoAposGerarPedido> acoes;
	

		
	public GeraPedidoHandler2(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	/*
	 		Observer
	 		
	 		Nesse padrão nós utilizamos listeners/observadores/ouvintes que ficam ouvindo as ações
	 	Dessa forma não precisamos ficar instanciando e chamando métodos a todo momento
	 	
	 	
	*/
	
	public void executa(Pedido pedido) {
		
		System.out.println("==========================================");
		
		System.out.println("CLASSE: " + this.getClass().getSimpleName());
		acoes.forEach(x-> x.executa(pedido));
		
		System.out.println("==========================================");
	}
	
	
	
}
