package it.epicode.models;

public class CentroControllo {
	
	private Comunicazione comunicazione;
	
	

	public CentroControllo(Comunicazione comunicazione) {
		super();
		this.comunicazione = comunicazione;
	}

	public void rilevaIncendio(Sonda s) {
		comunicazione.alarm(s.getId(), s.getLat(), s.getLon(), s.getSmokeLevel());
	}

}
