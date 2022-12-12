// Página 42 - Código 7. Classe Matematica dentro do pacote Apoio.

package Apoio;

public class Matematica {

	// AQUI FICARÃO OS ATRIBUTOS DA CLASSE
	public int resultado; // Com o "public" o atributo poderá ser visto de qualquer classe.

	// AQUI FICARÃO OS MÉTODOS DA CLASSE
	public void soma(int valor1, int valor2) {
		resultado=valor1+valor2;
	}

	public void multiplica(int valor1, int valor2) {
		resultado=valor1*valor2;
	}
	
}