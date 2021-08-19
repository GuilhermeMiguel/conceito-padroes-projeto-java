package br.com.empresa.comportamentais;
import java.math.BigDecimal;

import br.com.empresa.comportamentais.desconto.CalculadoraDeDescontos;
import br.com.empresa.comportamentais.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		var primeiro = new Orcamento(new BigDecimal("200"), 6);
		var segundo = new Orcamento(new BigDecimal("1200"), 1);
		
		var calculadora = new CalculadoraDeDescontos();
		
		System.out.println("Primeiro: " + calculadora.calcular(primeiro));
		
		System.out.println("Segundo: " + calculadora.calcular(segundo));
	}
}
