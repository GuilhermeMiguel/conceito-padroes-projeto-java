package br.com.empresa.estruturais;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.ItemOrcamento;
import br.com.empresa.estruturais.orcamento.Orcamento;

public class TestesDescontosComposite {

	public static void main(String[] args) {
		
		/*
		 	Com o padrão composite eu vou compondo objetos
		 	
		 	nesse exemplo, as class Orcamento e ItemOrcamento implementam a interface Orcavel, então eu posso compor uma dentro da outra
		 	
		 	seria como uma arvore, onde um objeto compoe outrom, que é composto por outro, e assim vai 
		 	
		 	
		 	esse é o padrão irmão do decorator
		 	
		 	mas no decorator eu vou decorando um objeto com o outro, passando um como parametro para o outro 
		 	
		 	no composite eu vou compondo um ao outro, adicionando um ao outro 
		 	
		*/
		
		var primeiroOrcamento = new Orcamento();
		primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
		primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		
		var segundoOrcamento = new Orcamento();
		segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		segundoOrcamento.adicionarItem(primeiroOrcamento);
		
		System.out.println("Valor segundo orcamento: " + segundoOrcamento.getValor());
	}
}
