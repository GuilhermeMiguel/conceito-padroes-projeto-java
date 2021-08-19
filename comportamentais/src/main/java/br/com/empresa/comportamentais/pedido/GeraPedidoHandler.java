package br.com.empresa.comportamentais.pedido;

public class GeraPedidoHandler /*implements handler*/{

	
	
	
	//recebendo com injecao de dependencias a repository, service, etc
		
	public GeraPedidoHandler() {
	}
	
	/*
	  		Command
	  		
	  		Uma variação do Command é o CommandHandler
	  		
	  		Nesse padrão nós temos classes que executam comandos, por exemplo, salvar no banco
	  	
	  	elas podem implementar interfaces como o metodo execute 
	  	
	  	
	  	Esses dados poderiam ser recebidos por uma api por exemplo
	  	
	  		É muito interessante o estudo de alguns padrões de arquitetura de software, como Domain Driven Design e Clean Architecture, 
	  	
	  	pois vão acabar abordando o padrão de Command Handlers
	 
	*/
	
	public void executa(Pedido pedido) {
		
		System.out.println("==========================================");
		
		System.out.println("CLASSE: " + this.getClass().getSimpleName());
		
		System.out.println("Salvar pedido do " + pedido.getCliente() + " no Banco de Dados!");
		
		System.out.println("Enviar e-mail com dados do novo pedido!");
		
		System.out.println("==========================================");
	}
	
	
	
}
