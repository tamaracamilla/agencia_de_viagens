package viagem;


public class Reserva {

	private String IdReserva;
	private String IdPassageiro;
	private String IdPacote;
	private String Nome;
	private String Telefone1;
	private String Destino;
	private String Origem;

	public String getIdReserva() {
		return IdReserva;
	}

	public void setIdReserva(String idReserva) {
		IdReserva = idReserva;
	}

	public String getIdPassageiro() {
		return IdPassageiro;
	}

	public void setIdPassageiro(String idPassageiro) {
		IdPassageiro = idPassageiro;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getTelefone1() {
		return Telefone1;
	}

	public void setTelefone1(String telefone1) {
		Telefone1 = telefone1;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getIdPacote() {
		return IdPacote;
	}

	public void setIdPacote(String idPacote) {
		IdPacote = idPacote;
	}

	
}
