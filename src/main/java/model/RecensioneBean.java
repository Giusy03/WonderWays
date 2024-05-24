package model;

import java.time.format.DateTimeFormatter;

public class RecensioneBean {
	private int idrecensione;
	private int idutente;
	private int idviaggio;
	private int valutazione;
	private String commento;
	private DateTimeFormatter datarecensione=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public int getIdrecensione() {
		return idrecensione;
	}
	public void setIdrecensione(int idrecensione) {
		this.idrecensione = idrecensione;
	}
	public int getIdutente() {
		return idutente;
	}
	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}
	public int getIdviaggio() {
		return idviaggio;
	}
	public void setIdviaggio(int idviaggio) {
		this.idviaggio = idviaggio;
	}
	public int getValutazione() {
		return valutazione;
	}
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;
	}
	public String getCommento() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	public DateTimeFormatter getDatarecensione() {
		return datarecensione;
	}
	public void setDatarecensione(DateTimeFormatter datarecensione) {
		this.datarecensione = datarecensione;
	}
	
}
