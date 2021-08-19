package br.com.empresa.estruturais;


import java.math.BigDecimal;

import br.com.empresa.estruturais.imposto.CalculadoraDeImpostos;
import br.com.empresa.estruturais.imposto.ICMS;
import br.com.empresa.estruturais.imposto.ISS;
import br.com.empresa.estruturais.orcamento.ItemOrcamento;
import br.com.empresa.estruturais.orcamento.Orcamento;

public class TestesImpostosDecorator {

	public static void main(String[] args) {
		var orcamento = new Orcamento();
		
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
		var calculadora = new CalculadoraDeImpostos();
		
		//se eu quiser calcular com um imposto só
		System.out.println("ICMS: " + calculadora.calcular(orcamento, new ISS(null)));
		
		/*
		 	Decorator 
		 
		 	Para um imposto eu passo a instancia do outro imposto
		 	
		 	Eu posso ir decorando / adicionando mais impostos sem a necessidade de alterar o código da minha classe Imposto
		
		*/
		System.out.println("ICMS e ISS: " + calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}
}
