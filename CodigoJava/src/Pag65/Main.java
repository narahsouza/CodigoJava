// Página 65 - Vamos melhorar este trecho de código e testar informando o numero 2.
// Página 65 - Agora vamos alterar o valor para 3 ao invés de 2.

package Pag65;

public class Main {

	public static void main(String[] args) {
		double valorDec = 3;
		int valorInt = (int) valorDec;
		
		System.out.println("Divisao do decimal: "+valorDec/2);
		System.out.println("Divisao do inteiro: "+valorInt/2);
		
		if (valorDec/2==valorInt/2) System.out.println("Mesmo resultado.");
		else System.out.println("Resultados diferentes.");
	}
}
