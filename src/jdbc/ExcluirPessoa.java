package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException, IOException {

		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);

		System.out.println("informe o codigo: ");
		int codigo = entrada.nextInt();

		String sql = "DELETE FROM pessoas WHERE codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);

		if (stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso");
		} else {
			System.out.println("Nada feito");
		}

		entrada.close();
		conexao.close();
	}

}
