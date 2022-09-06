package viagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ReservaDAO {
	public void save(Reserva reserva) {
		String sql = "INSERT INTO reserva (id_reserva, id_pacote, id_passageiro, nome, telefone1, destino, origem) VALUES (?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1,reserva.getIdReserva());
			pstm.setString(2,reserva.getIdPacote());
			pstm.setString(3,reserva.getIdPassageiro());
			pstm.setString(4,reserva.getNome());
			pstm.setString(5,reserva.getTelefone1());
			pstm.setString(6,reserva.getDestino());
			pstm.setString(7,reserva.getOrigem());
			
			

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try{
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
