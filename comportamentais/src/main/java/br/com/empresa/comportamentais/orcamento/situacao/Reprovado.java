package br.com.empresa.comportamentais.orcamento.situacao;

import br.com.empresa.comportamentais.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
