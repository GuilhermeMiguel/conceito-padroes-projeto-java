package br.com.empresa.estruturais.imposto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public abstract class Imposto {

	
	/*
	 	Esse é o padrão decorator
	 	
	 	 
	 	 	Dentro de uma classe eu declaro um atributo dela mesma - ela tem uma composição com ela mesma, ela está decorando ela mesma
	 	 
	 	 dessa forma eu posso chamar um mesmo metodo, mas com a perspectiva de cada classe filha 
	 	  
	*/
	
	
	private Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	protected abstract BigDecimal realizarCalulo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		var valorImposto = realizarCalulo(orcamento);
		
		var valorDoOutroImposto = BigDecimal.ZERO;
		
		if(outroImposto != null) 
			valorDoOutroImposto = outroImposto.realizarCalulo(orcamento);
		
		return valorImposto.add(valorDoOutroImposto);
	}
}
