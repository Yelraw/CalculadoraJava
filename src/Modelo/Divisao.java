package Modelo;

public class Divisao extends Operacao {

	@Override
	public String getNomeOperacao() {
		return "÷";
	}

	@Override
	public int getNumeroOperandos() {
		return 2;
	}

	@Override
	protected Double executarCalculo() {
		return operandos.get(0) / operandos.get(1);
	}

}
