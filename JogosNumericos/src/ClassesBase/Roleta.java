// Página 104 - Código 31. Classe Roleta sobre escrevendo método executaJogo() com nova regra de negócio.
// Página 107 - Código 34. Classe Roleta após os ajustes para herança.

package ClassesBase;

import java.util.Random;

public class Roleta extends Jogo {
	
	public void executaJogo() {
		Random rnd = new Random();
		this.setResultado(rnd.nextInt(37));
	}

}
