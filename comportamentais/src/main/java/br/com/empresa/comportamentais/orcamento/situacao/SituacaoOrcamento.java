package br.com.empresa.comportamentais.orcamento.situacao;

import java.math.BigDecimal;

import br.com.empresa.comportamentais.exception.SituacaoOrcamentoException;
import br.com.empresa.comportamentais.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	
	/*
	 
	  	O padr�o State, assim como o padr�o Strategy, resolve o problema de muitos ifs no c�digo.
	  	
	  	
	  	ELE � IDEAL PARA QUANDO PRECIAMOS TRABALHAR COM TRANSI��ES DE ESTADOS
	  	
	*/
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new SituacaoOrcamentoException("Or�amento n�o pode ser aprovado!");
	}
	
	
	public void reprovar(Orcamento orcamento) {
		throw new SituacaoOrcamentoException("Or�amento n�o pode ser reprovado!");
	}
	
	
	public void finalizar(Orcamento orcamento) {
		throw new SituacaoOrcamentoException("Or�amento n�o pode ser finalizado!");
	}
}
