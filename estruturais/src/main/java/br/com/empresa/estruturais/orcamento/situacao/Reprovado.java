package br.com.empresa.estruturais.orcamento.situacao;

import br.com.empresa.estruturais.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
