package viagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacoteDAO {
	public void save(Pacote pacote) {
		String sql = "INSERT INTO pacote (id_pacote, id_passageiro, data_viagem, data_hora, destino, origem) VALUES (?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, pacote.getIdPacote());
			pstm.setString(2, pacote.getIdPassageiro());
			pstm.setDate(3, pacote.getDataViagem());
			pstm.setTime(4, pacote.getDataHora());
			pstm.setString(5, pacote.getDestino());
			pstm.setString(6, pacote.getOrigem());

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
