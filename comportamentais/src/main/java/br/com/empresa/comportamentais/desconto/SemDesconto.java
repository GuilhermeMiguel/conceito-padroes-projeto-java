package br.com.empresa.comportamentais.desconto;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
