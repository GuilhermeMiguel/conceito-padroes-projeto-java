package br.com.empresa.estruturais.orcamento;

import java.util.Map;

import br.com.empresa.estruturais.exception.SituacaoOrcamentoException;
import br.com.empresa.estruturais.http.HttpAdapter;

public class RegistroDeOrcamento {

	private HttpAdapter http;
	
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}
	
	/*
	  	NO ADAPTER
	  	
	  		Eu posso por exemplo ter varias maneiras de fazer uma mesma coisa e a minha classe cliente
	  	não precisa saber disso, então eu posso utilizar o padão adapter 
	  
	  
	  
	  	Por exemplo: para fazer uma requisição eu posso utilizar 
	  	
	  	http client do java
	  	do apache 
	  	do spring 
	  	de alguma lib(library) -- biblioteca
	  	
	  	
	 */
	
	public void registrar(Orcamento orcamento) {
		if(!orcamento.isFinalizado()) {
			throw new SituacaoOrcamentoException("Orcamento nao finalizado!");
		}
		
		String url = "http://api.externa/orcamento";
		
		Map<String, Object> dados = Map.of(
				"valor", orcamento.getValor(),
				"quantidadeItens", orcamento.getQuantidadeItens()
		);
		
		http.post(url, dados);
	}
}
