package br.com.empresa.estruturais.desconto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public abstract class Desconto {

	/*
	  		O atributo desconto tem o tipo da própria classe, 
	  	se o desconto não for aplicado, ele vai tentar o próximo
	  	
	  	protected para conseguir acessar na classe filha
	*/
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	
	/*
	 		Template Method
	 		
	 	  Esse padrão favorece o reaproveitamento de códigos comuns entre classes, evitando assim duplicações de códigos.
	 	  
	 	  
	 	  O método calcular é o template method
	 	  
	 	  
	 	  ele faz parte do processo, outra parte ele delega
	 	  
	*/
	
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		/* 
		  		O if está na classe mãe -- o template
		
			mas a logica do deveAplicar está nas classes filhas -- sendo delegado
		*/
		
		if(deveAplicar(orcamento))
			return efetuarCalculo(orcamento);
		
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
