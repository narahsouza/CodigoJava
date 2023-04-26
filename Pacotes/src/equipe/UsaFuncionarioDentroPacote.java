// Página 212 - Figura 97. Estrutura do projeto ExplicaPacotes.
// Página 215 - Código 73. Testando visibilidade por uso de dentro do pacote.

package equipe;

public class UsaFuncionarioDentroPacote {
	
	public static void main (String args[]) {
		
		Funcionario fnc = new Funcionario();
			
		fnc.setor="Tecnologia";  // Definida como public
		
		fnc.matricula="0455675"; // Definida como protected
		
		fnc.anoInicio=2018;      // Definida como default
		
		fnc.senha="xyz";         // Definida como private
		
		fnc.setSenha("xyz");         // Método definido como public
		
		String senha=fnc.getSenha(); // Método definido como public		
	}
}
