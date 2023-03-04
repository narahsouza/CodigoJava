// Página 095 - Código 25. Classe TestaJogo utilizando a classe Jogo.
// Página 099 - Código 27. Classe TestaJogo ajustada para encapsulamento.
// Página 101 - Código 29. Classe TestaJogo após ajustes para polimorfismo.
// Página 103 - Código 30. Ajustes em TestaJogo para usar a classe Dado ao invés da classe Jogo.
// Página 107 - Código 35. Classe TestaJogo após os ajustes para herança.

import ClassesBase.Dado; 
import ClassesBase.Roleta; 

public class TestaJogo{ 
	
	public static void main(String[] args) {
		Dado dd=new Dado();
		dd.setAposta(1);
		dd.executaJogo();
		dd.mostraResultado();
		
		System.out.println("-");
		
		Roleta rl=new Roleta();
		rl.executaJogo();
		rl.mostraResultado();
		
	} 
}