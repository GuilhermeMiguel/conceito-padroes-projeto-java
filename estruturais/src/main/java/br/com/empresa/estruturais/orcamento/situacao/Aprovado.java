package br.com.empresa.estruturais.orcamento.situacao;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;


public class Aprovado extends SituacaoOrcamento{

	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.08"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
