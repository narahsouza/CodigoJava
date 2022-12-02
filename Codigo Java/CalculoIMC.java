// Página 26 - Programa para calcular o IMC (Índice de Massa Corporal) de uma pessoa.

class CalculoIMC {
	public static void main (String args[]) {
	
	double valorPesoKilogramas;
	double valorAlturaMetros;
	double calculoIMC;

	valorPesoKilogramas=56;
	valorAlturaMetros=1.67;
	calculoIMC=valorPesoKilogramas/(valorAlturaMetros*valorAlturaMetros);

	System.out.println("Seu peso: "+valorPesoKilogramas);
	System.out.println("Sua altura: "+valorAlturaMetros);
	System.out.println("IMC: "+calculoIMC);
	}
}