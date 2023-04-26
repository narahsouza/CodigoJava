// Página 225 - Código 78. Testando a classe Usuario.

package application;

import model.Usuario;

public class TestaComportamento {
	
	public static void main(String[] args) {
		
		// Usuario 1
		Usuario u1 = new Usuario();
		u1.setNome("Artur Campos");
		u1.setCPF("12345678912");
		u1.setSenha("senha");
		
		System.out.println("Usuario: " + u1.getNome());
		System.out.println("Usuario: " + u1.getUltimoNome());
		System.out.println("A senha confere? " + u1.validaSenha("senha"));
		System.out.println("O CPF e valido? " + u1.testaCPF());
		System.out.println("Instacias: " + Usuario.getUsuariosLogados());
		System.out.println("-");
		
		// Usuario 2
		Usuario u2 = new Usuario();
		u2.setNome("Andre Campos");
		u2.setCPF("2345678912");
		u2.setSenha("senha2");
		
		System.out.println("Usuario: " + u2.getNome());
		System.out.println("Usuario: " + u1.getUltimoNome());
		System.out.println("A senha confere? " + u2.validaSenha("senha"));
		System.out.println("O CPF e valido? " + u2.testaCPF());
		System.out.println("Instancias: " + Usuario.getUsuariosLogados());
	}
}
