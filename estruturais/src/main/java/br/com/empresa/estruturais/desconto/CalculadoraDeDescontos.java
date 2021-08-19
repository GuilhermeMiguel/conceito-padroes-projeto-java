package br.com.empresa.estruturais.desconto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	/*
	 		Chain of Responsibility 
	 		
	 		Nesse padrão de projeto nós criamos uma cadeia de chamadas, caso aquela regra não seja acatada o código passa para a próxima
	 	caso eu queira adicionar uma nova regra, eu adiciono essa nova chamada dentro dessa cadeia de chamadas 
	 	
	 	
	 		Nesse caso eu não utilizo o strategy, pois nele inicialmente eu já tenho que saber qual regra eu quero chamar
	 	aqui não, a prórpia cadeia se encarrega de decidir o que será aplicado 
	 	
	*/

	public BigDecimal calcular(Orcamento orcamento) {
						//Primeira chamada
		var cadeiaDeDescontos = new DescontoParaMaiorDeQuinhentos(
							//Segunda chamada
							new DescontoParaMaisDeCincoItens(
									//Encerrando a cadeia de chamadas 
									new SemDesconto()));
		
		
		return cadeiaDeDescontos.calcular(orcamento);
	}

}
