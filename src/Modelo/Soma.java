package Modelo;

public class Soma extends Operacao {
	protected Double executarCalculo() {
		return operandos.get(0) + operandos.get(1);
	}

	@Override
	public String getNomeOperacao() {
		return "+";
	}

	@Override
	public int getNumeroOperandos() {
		return 2;
	}
}
