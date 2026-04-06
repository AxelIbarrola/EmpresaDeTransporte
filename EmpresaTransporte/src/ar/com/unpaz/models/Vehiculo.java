package ar.com.unpaz.models;

public abstract class Vehiculo {
	
	private String patente;
	private String marca;
	protected double cantidadCombustible;

	public Vehiculo (String patente, String marca, double cantidadCombustible){
		
		this.patente = patente;
		this.marca = marca;
		this.cantidadCombustible = cantidadCombustible;
	}
	
	public abstract void avanzar(int km);
	
	public String getPatente() {
		return this.patente;
	}
	
	public String getMarca() {
		return this.marca;
	}

	public double getCantidadCombustible() {
		return this.cantidadCombustible;
	}
}

