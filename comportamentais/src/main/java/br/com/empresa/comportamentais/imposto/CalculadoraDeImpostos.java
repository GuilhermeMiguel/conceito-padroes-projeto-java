package br.com.empresa.comportamentais.imposto;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	/*
	  	
	  		STRATEGY
	  		
	  		No Strategy ao inv�s de eu utilizar v�rios if e elses, eu extraio a l�gica para as classes correspondentes
	  	E utilizo interfaces e o polimorfismo.
	  	
	  	 	Sempre que uma nova funcionalidade for implementada, o ideal � que possamos criar c�digo novo e editar o m�nimo poss�vel de c�digo j� existente. 
	  	 Este � um dos principais pontos do princ�pio Aberto-Fechado (Open-Closed Principle) do SOLID. 
	  	 Ao editar c�digo existente, podemos acabar quebrando funcionalidades j� implementadas e funcionais.
	  	
	*/
	
	
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}
}
