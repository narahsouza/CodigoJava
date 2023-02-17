// Página 093 - Código 24. Classe Jogo dentro do pacote ClassesBase.
// Página 098 - Código 26. Classe jogo ajustada para encapsulamento.
// Página 101 - Código 28. Classe Jogo depois dos ajustes para polimorfismo.
// Página 106 - Código 32. Classe Jogo após os ajustes para herança.

package ClassesBase;

import java.util.Random;

public class Jogo {
	
	// ATRIBUTOS
	private int aposta;
	private int resultado;
	
	// GETTERS E SETTERS
	public void setAposta(int aposta) {
		if (aposta > 6 || aposta < 1)
			System.out.println("APOSTA INVALIDA!");
		this.aposta = aposta;
	}
	
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	// METODOS
	public void executaJogo() {
		Random rnd = new Random();
		this.setResultado(rnd.nextInt(6)+1);
	}
	
	public void executaJogo(int aposta) {
		this.aposta=aposta;
		this.executaJogo();
	}
	
	public void mostraResultado() {
		System.out.println("Sua aposta: " + aposta + " Resultado: " + resultado);
		
		if (this.resultado == this.aposta)
			System.out.println("Parabens, voce acertou!");
		
		else System.out.println("Errou. Mas, continue tentando...");
	}
}
