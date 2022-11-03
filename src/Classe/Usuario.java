package Classe;

public class Usuario {
	// instanceof verifica se no caso objeto é uma instancia de usuario
	// Usuario outro = (Usuario) objeto; ==> converteu objeto para usuario

	String nome;
	String email;

	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}

}
