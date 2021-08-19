package br.com.empresa.comportamentais.imposto;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public class ICMS implements Imposto{

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.5"));
	}

}
