package viagem;

import java.sql.Time;
import java.sql.Date;

public class Pacote {
	

	private String IdPacote;
	private String IdPassageiro;
	private Date DataViagem;
	private Time DataHora;
	private String Destino;
	private String Origem;

	public String getIdPacote() {
		return IdPacote;
	}

	public void setIdPacote(String idPacote) {
		IdPacote = idPacote;
	}

	public String getIdPassageiro() {
		return IdPassageiro;
	}

	public void setIdPassageiro(String idPassageiro) {
		IdPassageiro = idPassageiro;
	}

	public Date getDataViagem() {
		return DataViagem;
	}

	public void setDataViagem(Date dataViagem) {
		DataViagem = dataViagem;
	}

	public Time getDataHora() {
		return DataHora;
	}

	public void setDataHora(Time dataHora) {
		DataHora = dataHora;
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

}
