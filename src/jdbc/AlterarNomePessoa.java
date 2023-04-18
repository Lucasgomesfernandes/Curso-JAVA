package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException, IOException {

		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();

		System.out.println("Informe o ID: ");
		int id = entrada.nextInt();

		String select = "SELECT codigo, nome FROM pessoas where codigo = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(select);
		// stmt.setString(id, nome);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

			System.out.println("O nome atual é: " + p.getNome());
			entrada.nextLine();

			System.out.println("Informe o novo nome: ");
			String nome = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			stmt.execute();

			System.out.println("Pessoa alterada com sucesso");
		} else {
			System.out.println("Pessoa nao encontrada");
		}

		conexao.close();
		entrada.close();
	}

}
