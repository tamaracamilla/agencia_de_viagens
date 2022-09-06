package viagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;

public class App {

	public static void main(String[] args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario("1");
		usuario.setNome("Pedro");
		usuario.setLogin("pedrinho_202");
		usuario.setSenha("12345678");
		UsuarioDAO dao = new UsuarioDAO();
		dao.save(usuario);
		
		Passageiro passageiro = new Passageiro();
		passageiro.setIdPassageiro("2");
		passageiro.setIdUsuario("1");
		passageiro.setCpf("04316483605");
		passageiro.setNome("Pedro");
		passageiro.setTelefone1("87999990976");
		passageiro.setTelefone2("87990900976");
		passageiro.setEmail("pedro@gmail.com");
		passageiro.setCep("55800000");
		passageiro.setBairro("Nova Cidade");
		passageiro.setNumero("872");
		passageiro.setLogradouro("Rua Alice 03");
		PassageiroDAO passageirodao = new PassageiroDAO();
		passageirodao.save(passageiro);
		
		Pacote pacote = new Pacote();
		pacote.setIdPacote("1070");
		pacote.setIdPassageiro("2");
		pacote.setDataViagem(Date.valueOf("2022-12-13"));
		pacote.setDataHora(Time.valueOf("10:30:00"));
		pacote.setDestino("Natal");
		pacote.setOrigem("Salvador");
		PacoteDAO pacotedao = new PacoteDAO();
		pacotedao.save(pacote);
		
		Reserva reserva = new Reserva();
		reserva.setIdReserva("12");
		reserva.setIdPassageiro("2");
		reserva.setIdPacote("1070");
		reserva.setNome("Pedro");
		reserva.setTelefone1("87999990976");
		reserva.setDestino("Natal");
		reserva.setOrigem("Salvador");
		ReservaDAO reservadao = new ReservaDAO();
		reservadao.save(reserva);
	}

}
