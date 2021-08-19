package br.com.empresa.comportamentais.desconto;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public class DescontoParaMaiorDeQuinhentos extends Desconto {

	
	public DescontoParaMaiorDeQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
