package br.com.empresa.estruturais.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.empresa.estruturais.orcamento.situacao.EmAnalise;
import br.com.empresa.estruturais.orcamento.situacao.Finalizado;
import br.com.empresa.estruturais.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private List<Orcavel> itens;
	private BigDecimal valor; 
	private SituacaoOrcamento situacao;
	
	public Orcamento() {
		this.valor = BigDecimal.ZERO;;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}
	
	
	
	public void aplicarDescontoExtra() {
		//O this é o prório orcamento
		
		var valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValorProxy() {
		/*
		  	Simulando lentidao
		 */
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		return valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado() {
		return this.situacao instanceof Finalizado;
	}
	
	public int getQuantidadeItens() {
		return itens.size();
	}
	
	public void adicionarItem(Orcavel item) {
		this.valor = this.valor.add(item.getValor());
		this.itens.add(item);
	}
	
}
