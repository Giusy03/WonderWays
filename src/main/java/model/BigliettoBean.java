package model;

import java.time.LocalDateTime;

public class BigliettoBean {
private int idbiglietto;
private int idutente;
private LocalDateTime dataacquisto;
private double prezzo; 
private int idviaggio;
public int getIdbiglietto() {
	return idbiglietto;
}
public void setIdbiglietto(int idbiglietto) {
	this.idbiglietto = idbiglietto;
}
public int getIdutente() {
	return idutente;
}
public void setIdutente(int idutente) {
	this.idutente = idutente;
}
public LocalDateTime getDataacquisto() {
	return dataacquisto;
}
public void setDataacquisto(LocalDateTime dataacquisto) {
	this.dataacquisto = dataacquisto;
}
public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}
public int getIdviaggio() {
	return idviaggio;
}
public void setIdviaggio(int idviaggio) {
	this.idviaggio = idviaggio;
}

}
