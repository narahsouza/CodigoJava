// Página 212 - Figura 97. Estrutura do projeto ExplicaPacotes.
// Página 214 - Código 72. Testando visibilidade por herança fora do pacote.

package application;

import equipe.Funcionario;

public class HerdaFuncionarioForaPacote extends Funcionario {
	
	public void setValores() {
		
		super.setor="Tecnologia";  // Definida como public
		
		super.matricula="0455675"; // Definida como protected
		
		super.anoInicio=2018;      // Definida como default
		
		super.senha="xyz";         // Definida como private
		
		super.setSenha("xyz");         // Método definido como public
		
		String senha=super.getSenha(); // Método definido como public
	}
}
