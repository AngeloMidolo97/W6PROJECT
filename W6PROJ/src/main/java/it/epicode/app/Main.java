package it.epicode.app;

import it.epicode.models.CentroControllo;
import it.epicode.models.Comunicazione;
import it.epicode.models.ControlloSonda;
import it.epicode.models.Sonda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sonda s = new Sonda(1, 20.56, 50.34);
		
		Comunicazione co = new Comunicazione();
		CentroControllo c = new CentroControllo(co);
		ControlloSonda cs = new ControlloSonda(1, c);
		s.addObserver(cs);
		s.setSmokeLevel(6);
		
		
	}

}
