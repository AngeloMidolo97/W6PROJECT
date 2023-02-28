package it.epicode.test;

import static org.junit.Assert.*;

import it.epicode.models.CentroControllo;
import it.epicode.models.ControlloSonda;
import it.epicode.models.Sonda;
import junit.framework.Assert;

public class Test {
	
	CentroControllo centroControllo;

	@org.junit.Test
	public void creaControlloSonda() {
		ControlloSonda cs = new ControlloSonda(1, centroControllo);
		Sonda s = new Sonda(1, 40, 70);
		
		s.addObserver(cs);
		
		assertTrue(s.getObservers().contains(cs));
	}
	
	@org.junit.Test
	public void testFumoDown() {
	    // Creazione di un oggetto ControlloSonda
	    ControlloSonda cts1 = new ControlloSonda(1, centroControllo);

	    // Creazione di un oggetto Sonda
	    Sonda s = new Sonda(1, 44.424829,  8.932020);

	    // Aggiunta dell'oggetto ControlloSonda come observer della sonda
	    s.addObserver(cts1);

	    // Verifica che l'esecuzione del metodo setSmokeLevel non lanci un'eccezione
	    try {
	        s.setSmokeLevel(2);
	    } catch (Exception e) {
	        Assert.fail("Unexpected exception thrown: " + e);
	    }
	}

}
