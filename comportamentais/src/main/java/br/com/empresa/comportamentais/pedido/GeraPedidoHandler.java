package br.com.empresa.comportamentais.pedido;

public class GeraPedidoHandler /*implements handler*/{

	
	
	
	//recebendo com injecao de dependencias a repository, service, etc
		
	public GeraPedidoHandler() {
	}
	
	/*
	  		Command
	  		
	  		Uma varia��o do Command � o CommandHandler
	  		
	  		Nesse padr�o n�s temos classes que executam comandos, por exemplo, salvar no banco
	  	
	  	elas podem implementar interfaces como o metodo execute 
	  	
	  	
	  	Esses dados poderiam ser recebidos por uma api por exemplo
	  	
	  		� muito interessante o estudo de alguns padr�es de arquitetura de software, como Domain Driven Design e Clean Architecture, 
	  	
	  	pois v�o acabar abordando o padr�o de Command Handlers
	 
	*/
	
	public void executa(Pedido pedido) {
		
		System.out.println("==========================================");
		
		System.out.println("CLASSE: " + this.getClass().getSimpleName());
		
		System.out.println("Salvar pedido do " + pedido.getCliente() + " no Banco de Dados!");
		
		System.out.println("Enviar e-mail com dados do novo pedido!");
		
		System.out.println("==========================================");
	}
	
	
	
}
