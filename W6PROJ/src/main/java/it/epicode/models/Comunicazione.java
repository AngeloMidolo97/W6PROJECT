package it.epicode.models;

public class Comunicazione {
	

	public void alarm(int idSonda, double d, double e, int smokeLevel) {
		System.out.println("http://host/alarm?=idsonda=["+ idSonda +"]&lat=["+ d +"]&lon=["+ e +"]&smokelevel=["+ smokeLevel +"]");
		
		System.out.println("é stato rilevato un incendio dalla sonda " + idSonda + " "
				+ "nel luogo con le seguenti coordinate " + d + " " + e + " livello di fumo: " + smokeLevel);
	}
}
