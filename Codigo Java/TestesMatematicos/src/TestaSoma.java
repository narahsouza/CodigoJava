// Página 60 - Figura 38. Criando classe com ponto de início para execução.
// Página 67 - Código 15. Classe TestaSoma atualizada para testar o método par().

public class TestaSoma {

	public static void main(String[] args) {
		
		MatematicaAvancada ma=new MatematicaAvancada();
		ma.soma(10, 5);
				
		double rsto= ma.getResultado(); 
		System.out.println("Resultado: "+rsto); 
		
		if(ma.par(rsto)) { 
			System.out.println("Este numero e par"); 	
		} 
		else { 
			System.out.println("Este numero e impar");
		}
	}
}
