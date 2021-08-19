package br.com.empresa.estruturais.desconto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public class DescontoParaMaisDeCincoItens extends Desconto{

	
	public DescontoParaMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
}
