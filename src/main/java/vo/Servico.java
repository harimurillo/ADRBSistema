package vo;

import java.time.LocalDate;

public class Servico {

	private int cod;
	private LocalDate dtInicio;
	private LocalDate dtConclusao;
	private int codProcedimento;
	private int codPaciente;
	private int codFuncionario;
	private int codOrcamento;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public LocalDate getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}

	public LocalDate getDtConclusao() {
		return dtConclusao;
	}

	public void setDtConclusao(LocalDate dtConclusao) {
		this.dtConclusao = dtConclusao;
	}

	public int getCodProcedimento() {
		return codProcedimento;
	}

	public void setCodProcedimento(int codProcedimento) {
		this.codProcedimento = codProcedimento;
	}

	public int getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(int codPaciente) {
		this.codPaciente = codPaciente;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public int getCodOrcamento() {
		return codOrcamento;
	}

	public void setCodOrcamento(int codOrcamento) {
		this.codOrcamento = codOrcamento;
	}

}
