package model;

import java.time.LocalDateTime;

public class ProgrammaInfluencerBean {
	private int idprogramma;
	private int idutente;
	private String link ;
	private int punti;
	private LocalDateTime dataiscrizione;
	public int getIdprogramma() {
		return idprogramma;
	}
	public void setIdprogramma(int idprogramma) {
		this.idprogramma = idprogramma;
	}
	public int getIdutente() {
		return idutente;
	}
	public void setIdutente(int idutente) {
		this.idutente = idutente;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getPunti() {
		return punti;
	}
	public void setPunti(int punti) {
		this.punti = punti;
	}
	public LocalDateTime getDataiscrizione() {
		return dataiscrizione;
	}
	public void setDataiscrizione(LocalDateTime dataiscrizione) {
		this.dataiscrizione = dataiscrizione;
	}
	
	
}
