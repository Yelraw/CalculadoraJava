package Modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacao {
	protected List<Double> operandos;
	protected String operacao;
	
	public Operacao () {
		operacao = this.getNomeOperacao();
		operandos = new ArrayList<>();
	}

	public abstract String getNomeOperacao();
	public abstract int getNumeroOperandos();
	protected abstract Double executarCalculo();
	
	public boolean addOperando(Double valor) {
		if(operandos.size() < this.getNumeroOperandos()) {
			operandos.add(valor);
		}else {
			throw new RuntimeException("Permitido apenas dois operandos!");
		}
		return true;
	}
	
	public void validar() {
		if(operandos.size() != this.getNumeroOperandos()) {
			throw new RuntimeException("Exigido dois operandos para calcular");
		}
	}
	
	public Double calcular() {
		this.validar();
		double resultado = executarCalculo();
		operandos.clear();
		return resultado;
	}
	
	public String saidaCalculo() {
		String aux= "";
		for(Double valor : this.operandos) {
			aux += this.getNomeOperacao() + " " + valor.toString() + " ";
		}
		aux = aux.substring(this.getNomeOperacao().length() + 1);
		aux = aux + "= " + calcular().toString();
		
		return aux;
	}
	
}
