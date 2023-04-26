// Página 212 - Figura 97. Estrutura do projeto ExplicaPacotes.
// Página 213 - Código 71. Testando visibilidade por herança dentro do pacote.

package equipe;

public class HerdaFuncionarioDentroPacote extends Funcionario {
	
	public void setValores() {
		
		super.setor="Tecnologia";  // Definida como public
		
		super.matricula="0455675"; // Definida como protected
		
		super.anoInicio=2018;      // Definida como default
		
		super.senha="xyz";         // Definida como private
		
		super.setSenha("xyz");         // Método definido como public
		
		String senha=super.getSenha(); // Método definido como public
	}
}
