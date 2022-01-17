package br.com.roberto.calculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	void valorAlterado(String novoValor);
}
