package br.com.empresa.comportamentais.imposto;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
}
