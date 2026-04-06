package ar.com.unpaz.models;

import ar.com.unpaz.exceptions.CombustibleInsuficienteException;

public class Camion extends Vehiculo{
	
	public Camion (String patente, String marca, double cantidadCombustible) {
		super(patente, marca, cantidadCombustible);
	}
	
	@Override
	public void avanzar(int km) {
		
		double combustibleNecesario = km / 4;
		
		if (combustibleNecesario <= this.cantidadCombustible) {
			
			System.out.println("Combustible suficiente, camion avanzando (" + km + "km)...");
			this.cantidadCombustible -= combustibleNecesario;
			
		} else {
			
			throw new CombustibleInsuficienteException("Combustible insuficiente.");
		}
	}
}
