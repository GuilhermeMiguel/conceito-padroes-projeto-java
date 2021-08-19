package br.com.empresa.comportamentais;
import java.math.BigDecimal;

import br.com.empresa.comportamentais.imposto.CalculadoraDeImpostos;
import br.com.empresa.comportamentais.imposto.ICMS;
import br.com.empresa.comportamentais.imposto.ISS;
import br.com.empresa.comportamentais.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		var primeiro = new Orcamento(new BigDecimal("200"), 6);
		var segundo = new Orcamento(new BigDecimal("1200"), 1);
		
		var calculadora = new CalculadoraDeImpostos();
		
		System.out.println("Primeiro ICMS: " + calculadora.calcular(primeiro, new ICMS()));
		
		System.out.println("Segundo ISS: " + calculadora.calcular(segundo, new ISS()));
	}
}
