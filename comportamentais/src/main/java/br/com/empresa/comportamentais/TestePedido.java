package br.com.empresa.comportamentais;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.empresa.comportamentais.orcamento.Orcamento;
import br.com.empresa.comportamentais.pedido.EmailService;
import br.com.empresa.comportamentais.pedido.GeraPedidoHandler;
import br.com.empresa.comportamentais.pedido.GeraPedidoHandler2;
import br.com.empresa.comportamentais.pedido.Pedido;
import br.com.empresa.comportamentais.pedido.SalvaPedidoService;

public class TestePedido {

	public static void main(String[] args) {
		
		/*
		 		por exemplo, se estivesse numa api receberia o command 
		 	
		 	e teria a classe handler
		 	
		*/
		
		var cliente = "Jô Soares";
		
		var orcamento = new Orcamento(new BigDecimal("200"), 6);
		
		var pedido = new Pedido(cliente, orcamento, LocalDateTime.now());
		
		var gerador = new GeraPedidoHandler();
		
		gerador.executa(pedido);
		
		
		//Observer -- definindo as ações
		
		var listaAcoes = Arrays.asList(new SalvaPedidoService(), new EmailService());
		
		var geradorObserver = new GeraPedidoHandler2(listaAcoes);
		
		geradorObserver.executa(pedido);
		
		
	}
}
