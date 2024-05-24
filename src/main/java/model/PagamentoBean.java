package model;

import java.time.LocalDateTime;

public class PagamentoBean {
	private int idpagamento;
	private int idbiglietto;
	private String metodopagamento;
	private int numerocarta;
	private LocalDateTime datascadenza;
	private int cvv;
	private double importo;
	private LocalDateTime datapagamento;
	public int getIdpagamento() {
		return idpagamento;
	}
	public void setIdpagamento(int idpagamento) {
		this.idpagamento = idpagamento;
	}
	public int getIdbiglietto() {
		return idbiglietto;
	}
	public void setIdbiglietto(int idbiglietto) {
		this.idbiglietto = idbiglietto;
	}
	public String getMetodopagamento() {
		return metodopagamento;
	}
	public void setMetodopagamento(String metodopagamento) {
		this.metodopagamento = metodopagamento;
	}
	public int getNumerocarta() {
		return numerocarta;
	}
	public void setNumerocarta(int numerocarta) {
		this.numerocarta = numerocarta;
	}
	public LocalDateTime getDatascadenza() {
		return datascadenza;
	}
	public void setDatascadenza(LocalDateTime datascadenza) {
		this.datascadenza = datascadenza;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public LocalDateTime getDatapagamento() {
		return datapagamento;
	}
	public void setDatapagamento(LocalDateTime datapagamento) {
		this.datapagamento = datapagamento;
	}
	
}
