package br.com.empresa.estruturais.imposto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public class ISS extends Imposto{

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected BigDecimal realizarCalulo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.07"));
	}

}
