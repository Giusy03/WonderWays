package model;

import java.time.LocalDateTime;

public class ViaggiBean {
private int idviaggio;
private String tipoviaggio;
private int numero;
private String compagnia;
private String partenza;
private String arrivo;
private LocalDateTime datapartenza;
private LocalDateTime dataarrivo;
private double prezzo;
public int getIdviaggio() {
	return idviaggio;
}
public void setIdviaggio(int idviaggio) {
	this.idviaggio = idviaggio;
}
public String getTipoviaggio() {
	return tipoviaggio;
}
public void setTipoviaggio(String tipoviaggio) {
	this.tipoviaggio = tipoviaggio;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getCompagnia() {
	return compagnia;
}
public void setCompagnia(String compagnia) {
	this.compagnia = compagnia;
}
public String getPartenza() {
	return partenza;
}
public void setPartenza(String partenza) {
	this.partenza = partenza;
}
public String getArrivo() {
	return arrivo;
}
public void setArrivo(String arrivo) {
	this.arrivo = arrivo;
}
public LocalDateTime getDatapartenza() {
	return datapartenza;
}
public void setDatapartenza(LocalDateTime datapartenza) {
	this.datapartenza = datapartenza;
}
public LocalDateTime getDataarrivo() {
	return dataarrivo;
}
public void setDataarrivo(LocalDateTime dataarrivo) {
	this.dataarrivo = dataarrivo;
}
public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}

}

