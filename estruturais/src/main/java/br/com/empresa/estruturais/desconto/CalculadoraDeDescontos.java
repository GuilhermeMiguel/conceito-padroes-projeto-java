package br.com.empresa.estruturais.desconto;

import java.math.BigDecimal;

import br.com.empresa.estruturais.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	/*
	 		Chain of Responsibility 
	 		
	 		Nesse padr�o de projeto n�s criamos uma cadeia de chamadas, caso aquela regra n�o seja acatada o c�digo passa para a pr�xima
	 	caso eu queira adicionar uma nova regra, eu adiciono essa nova chamada dentro dessa cadeia de chamadas 
	 	
	 	
	 		Nesse caso eu n�o utilizo o strategy, pois nele inicialmente eu j� tenho que saber qual regra eu quero chamar
	 	aqui n�o, a pr�rpia cadeia se encarrega de decidir o que ser� aplicado 
	 	
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
