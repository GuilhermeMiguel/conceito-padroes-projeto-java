package br.com.empresa.estruturais;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.empresa.estruturais.orcamento.ItemOrcamento;
import br.com.empresa.estruturais.orcamento.Orcamento;
import br.com.empresa.estruturais.pedido.EmailService;
import br.com.empresa.estruturais.pedido.GeraPedidoHandler;
import br.com.empresa.estruturais.pedido.GeraPedidoHandler2;
import br.com.empresa.estruturais.pedido.Pedido;
import br.com.empresa.estruturais.pedido.SalvaPedidoService;

public class TestePedido {

	public static void main(String[] args) {
		
		/*
		 		por exemplo, se estivesse numa api receberia o command 
		 	
		 	e teria a classe handler
		 	
		*/
		
		var cliente = "Jô Soares";
		
		var orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
		
		var pedido = new Pedido(cliente, orcamento, LocalDateTime.now());
		
		var gerador = new GeraPedidoHandler();
		
		gerador.executa(pedido);
		
		
		//Observer -- definindo as ações
		
		var listaAcoes = Arrays.asList(new SalvaPedidoService(), new EmailService());
		
		var geradorObserver = new GeraPedidoHandler2(listaAcoes);
		
		geradorObserver.executa(pedido);
		
		
	}
}
