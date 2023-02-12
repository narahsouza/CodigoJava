// Página 55 - Figura 31. Código inicial de MatematicaAvancada, com erro.
// Página 57 - Figura 33. Resultado da primeira ajuda do Eclipse.
// Página 58 - Figura 36. Setter e Getter criado automaticamente pelo Eclipse.
// Página 66 - Código 14. Classe MatematicaAvancada com método par().

public class MatematicaAvancada {
	private double resultado;

	public void soma(double valor1, double valor2) {
		setResultado(valor1*valor2);
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public boolean par(double valorDec) { 
		
		boolean retorno = false; 
		
		int valorInt = (int) valorDec; 
		
		if (valorDec/2==valorInt/2) retorno=true; 
		
		return retorno; 
		
	}
}