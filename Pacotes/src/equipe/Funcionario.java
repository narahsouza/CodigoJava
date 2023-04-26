// Página 209 - Código 69. Classe Funcionario.
// Página 212 - Código 70. Classe Funcionario com atributos e métodos.

package equipe;

public class Funcionario extends Pessoa {
	
	public String setor; // Visível em todos os pacotes e classes
	
	protected String matricula; // Visível no pacote e em subclasses
	
	int anoInicio; // Visível apenas no pacote
	
	private String senha; // Visível apenas nesta classe
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
