class Ex04_CalculoIMC {
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