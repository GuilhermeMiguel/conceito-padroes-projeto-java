package br.com.empresa.estruturais;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.ItemOrcamento;
import br.com.empresa.estruturais.orcamento.Orcamento;
import br.com.empresa.estruturais.orcamento.OrcamentoProxy;

public class TestesDescontosProxy {

	public static void main(String[] args) {
		
		/*
		 	Com o Padrão proy nós criamos uma espécie de cache
		 	
		 	É um intermediario que faz alguma açao
		 	
		 	Podemos também utilizar o padrão Proxy para interceptar classes e executar regras de segurança
		 	
		 	O hibernate, utiliza muito esse padrao 
		 	
		*/
		
		var primeiroOrcamento = new Orcamento();
		primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
		primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
		
		var segundoOrcamento = new Orcamento();
		segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		segundoOrcamento.adicionarItem(primeiroOrcamento);
		
		
		var proxy = new OrcamentoProxy(segundoOrcamento);
				
		//System.out.println("Valor segundo orcamento -- com proxy: " + proxy.getValorProxy());
		
		
		System.out.println("Valor segundo orcamento -- com proxy : " + proxy.getValorProxy());
		
		System.out.println("Valor segundo orcamento -- com proxy: " + proxy.getValorProxy());
	}
}
