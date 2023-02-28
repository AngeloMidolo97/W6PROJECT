package it.epicode.models;

public class ControlloSonda implements Observer {
	
	private int id;
	
	private CentroControllo centroControllo;

	public ControlloSonda(int id, CentroControllo centroControllo) {
		super();
		this.id = id;
		this.centroControllo = centroControllo;
	}

	@Override
	public void update(Subject obj) {
		// TODO Auto-generated method stub
		Sonda s = (Sonda)obj;
		centroControllo.rilevaIncendio(s);
	}
	
	

}
