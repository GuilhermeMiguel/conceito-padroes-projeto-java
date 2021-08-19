package br.com.empresa.estruturais;

import java.math.BigDecimal;

import br.com.empresa.estruturais.http.JavaHttpClient;
import br.com.empresa.estruturais.orcamento.ItemOrcamento;
import br.com.empresa.estruturais.orcamento.Orcamento;
import br.com.empresa.estruturais.orcamento.RegistroDeOrcamento;

public class TesteAdapter {

	public static void main(String[] args) {
		var orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("400")));
		
		orcamento.aprovar();
		orcamento.finalizar();
		
		
		/*
		  	
		  	Eu posso passar qual o tipo de requisicao http eu quero executar
		  	
		*/
		var registroOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
		
		registroOrcamento.registrar(orcamento);
	}

}
