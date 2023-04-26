// Página 212 - Figura 97. Estrutura do projeto ExplicaPacotes.
// Página 215 - Código 74. Testando visibilidade por uso de fora do pacote.

package application;

import equipe.Funcionario;

public class UsaFuncionarioForaPacote {
	
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
