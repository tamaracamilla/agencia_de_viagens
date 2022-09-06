package viagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
	public void save(Usuario usuario) {
		String sql = "INSERT INTO usuario (nome, id_usuario, login, senha) VALUES (?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1,usuario.getNome());
			pstm.setString(2,usuario.getIdUsuario());
			pstm.setString(3,usuario.getLogin());
			pstm.setString(4,usuario.getSenha());
			
			

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
