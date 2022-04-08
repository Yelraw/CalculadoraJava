package Controle;

import java.util.ArrayList;

import Modelo.Divisao;
import Modelo.Operacao;
import Modelo.Produto;
import Modelo.Raiz;
import Modelo.Soma;
import Modelo.Subtracao;

public class Calculadora {
	public ArrayList<Operacao> listaDeOperacoes (){
		ArrayList<Operacao> operacoes = new ArrayList<Operacao>();
		operacoes.add(new Soma());
		operacoes.add(new Subtracao());
		operacoes.add(new Produto());
		operacoes.add(new Divisao());
		operacoes.add(new Raiz());
		return operacoes;
	}
	
	public int operacaoAtual (String sinal) {
		int operacao = 0;
		for (int i = 0; i < listaDeOperacoes().size(); i++) {
			if(sinal.equals(listaDeOperacoes().get(i).getNomeOperacao())) {
				operacao = i;
			}
		}
		return operacao;
	}

	public boolean verificarOperacao(String op){
		for(int i = 0; i<listaDeOperacoes().size(); i++){
			if(op.equals(listaDeOperacoes().get(i).getNomeOperacao())){
				return true;
			}
		}
		return false;
	}
	
}
