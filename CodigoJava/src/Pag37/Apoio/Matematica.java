// Página 35 - Código 2. Nova classe matemática.
// Página 39 - Código 4. Classe Matematica com atributo.
// Página 39 - Código 4. Classe Matematica com atributo.
// Página 42 - Código 7. Classe Matematica dentro do pacote Apoio.
// Página 46 - Código 10. Matematica.java.

package Pag37.Apoio;

public class Matematica {

	// AQUI FICARÃO OS ATRIBUTOS DA CLASSE
	private int resultado;
	
	// GETTERS E SETTERS
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	// AQUI FICARÃO OS MÉTODOS DA CLASSE
	public void soma(int valor1, int valor2) {
		setResultado(valor1+valor2);
	}
	public void multiplica(int valor1, int valor2) {
		setResultado(valor1*valor2);
	}
}