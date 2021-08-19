package br.com.empresa.estruturais.desconto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public abstract class Desconto {

	/*
	  		O atributo desconto tem o tipo da pr�pria classe, 
	  	se o desconto n�o for aplicado, ele vai tentar o pr�ximo
	  	
	  	protected para conseguir acessar na classe filha
	*/
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	
	/*
	 		Template Method
	 		
	 	  Esse padr�o favorece o reaproveitamento de c�digos comuns entre classes, evitando assim duplica��es de c�digos.
	 	  
	 	  
	 	  O m�todo calcular � o template method
	 	  
	 	  
	 	  ele faz parte do processo, outra parte ele delega
	 	  
	*/
	
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		/* 
		  		O if est� na classe m�e -- o template
		
			mas a logica do deveAplicar est� nas classes filhas -- sendo delegado
		*/
		
		if(deveAplicar(orcamento))
			return efetuarCalculo(orcamento);
		
		return proximo.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
