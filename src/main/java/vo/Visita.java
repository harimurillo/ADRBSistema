package vo;

import java.time.LocalDate;

public class Visita {

	private int cod;
	private LocalDate dtVisita;
	private int codPaciente;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public LocalDate getDtVisita() {
		return dtVisita;
	}

	public void setDtVisita(LocalDate dtVisita) {
		this.dtVisita = dtVisita;
	}

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}

}
