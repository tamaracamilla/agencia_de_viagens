package viagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PassageiroDAO {
	public void save(Passageiro passageiro) {
		String sql = "INSERT INTO passageiro (id_passageiro,id_usuario , cpf, nome, telefone1, telefone2, email, cep, bairro, numero, logradouro) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, passageiro.getIdPassageiro());
			pstm.setString(2, passageiro.getIdUsuario());
			pstm.setString(3, passageiro.getCpf());
			pstm.setString(4, passageiro.getNome());
			pstm.setString(5, passageiro.getTelefone1());
			pstm.setString(6, passageiro.getTelefone2());
			pstm.setString(7, passageiro.getEmail());
			pstm.setString(8, passageiro.getCep());
			pstm.setString(9, passageiro.getBairro());
			pstm.setString(10, passageiro.getNumero());
			pstm.setString(11, passageiro.getLogradouro());

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
