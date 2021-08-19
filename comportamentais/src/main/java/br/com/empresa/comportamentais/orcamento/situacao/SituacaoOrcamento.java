package br.com.empresa.comportamentais.orcamento.situacao;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.exception.SituacaoOrcamentoException;
import br.com.empresa.comportamentais.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	
	/*
	 
	  	O padrão State, assim como o padrão Strategy, resolve o problema de muitos ifs no código.
	  	
	  	
	  	ELE É IDEAL PARA QUANDO PRECIAMOS TRABALHAR COM TRANSIÇÕES DE ESTADOS
	  	
	*/
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new SituacaoOrcamentoException("Orçamento não pode ser aprovado!");
	}
	
	
	public void reprovar(Orcamento orcamento) {
		throw new SituacaoOrcamentoException("Orçamento não pode ser reprovado!");
	}
	
	
	public void finalizar(Orcamento orcamento) {
		throw new SituacaoOrcamentoException("Orçamento não pode ser finalizado!");
	}
}
