// Página 60 - Figura 38. Criando classe com ponto de início para execução.
// Página 67 - Código 15. Classe TestaSoma atualizada para testar o método par().
// Página 70 - Código 17. Classe TestaSoma utilizando o método descontoSeguro() da classe MatematicaAvancada.

public class TestaSoma {

	public static void main(String[] args) {
		
		MatematicaAvancada ma=new MatematicaAvancada();
		ma.soma(900, 750);
		
		double valorSeguro=ma.getResultado();
		System.out.println("Valor do Seguro.........: "+valorSeguro);
		
		if(ma.par(valorSeguro)) {
			 System.out.println("------------------------> Este numero e par");
		}
		else {
			System.out.println("------------------------> Este numero e impar");
		}
		
		double fatorDesconto=ma.descontoSeguro(5); // Classe bônus 5
		double seguroDesconto=valorSeguro*fatorDesconto;
		double seguroFinal=valorSeguro-seguroDesconto;
		
		System.out.println("Fator de desconto.......: "+fatorDesconto);
		System.out.println("Valor do desconto.......: "+seguroDesconto);
		System.out.println("Seguro com desconto.....: "+seguroFinal);
	}
}
