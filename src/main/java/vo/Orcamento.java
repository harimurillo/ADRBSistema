package vo;

import java.time.LocalDate;

public class Orcamento {

	private int cod;
	private double valorTotal;
	private double valorPago;
	private LocalDate dtOrcamento;
	private int codFuncionario;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public LocalDate getDtOrcamento() {
		return dtOrcamento;
	}

	public void setDtOrcamento(LocalDate dtOrcamento) {
		this.dtOrcamento = dtOrcamento;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

}
