package br.com.empresa.comportamentais.imposto;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	/*
	  	
	  		STRATEGY
	  		
	  		No Strategy ao invés de eu utilizar vários if e elses, eu extraio a lógica para as classes correspondentes
	  	E utilizo interfaces e o polimorfismo.
	  	
	  	 	Sempre que uma nova funcionalidade for implementada, o ideal é que possamos criar código novo e editar o mínimo possível de código já existente. 
	  	 Este é um dos principais pontos do princípio Aberto-Fechado (Open-Closed Principle) do SOLID. 
	  	 Ao editar código existente, podemos acabar quebrando funcionalidades já implementadas e funcionais.
	  	
	*/
	
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
